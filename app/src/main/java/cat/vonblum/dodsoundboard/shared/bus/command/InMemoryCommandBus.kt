package cat.vonblum.dodsoundboard.shared.bus.command

import cat.vonblum.dodsoundboard.shared.domain.bus.command.Command
import cat.vonblum.dodsoundboard.shared.domain.bus.command.CommandBus
import cat.vonblum.dodsoundboard.shared.domain.bus.command.CommandHandler

class InMemoryCommandBus(commandHandlers: List<CommandHandler>) : CommandBus {

    private val commandHandlerMap: Map<String, CommandHandler> =
        commandHandlers.associateBy { commandHandler ->
            commandHandler::class.simpleName?.removeSuffix("Handler")
                ?: throw RuntimeException("Command handler has no simple name")
        }

    override fun dispatch(command: Command) {
        val commandName = command.javaClass.simpleName

        if (!commandHandlerMap.containsKey(commandName)) {
            throw CommandNotRegisteredException.becauseOf(command)
        }

        val commandHandler = commandHandlerMap[commandName]
        val handleMethod = commandHandler?.javaClass?.getDeclaredMethod("handle", command.javaClass)
        handleMethod?.invoke(commandHandler, command)
    }

}