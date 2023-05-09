package cat.vonblum.dodsoundboard.shared.bus.command

import cat.vonblum.dodsoundboard.shared.domain.bus.command.Command
import cat.vonblum.dodsoundboard.shared.domain.bus.command.CommandBus
import cat.vonblum.dodsoundboard.shared.domain.bus.command.CommandHandler
import cat.vonblum.shared.infrastructure.bus.MessageBus
import cat.vonblum.shared.infrastructure.bus.UnregisteredHandlerException

class InMemoryCommandBus(commandHandlers: List<CommandHandler>) : CommandBus {

    private val messageBus = MessageBus(commandHandlers)

    override fun dispatch(command: Command) {
        try {
            messageBus.dispatch(command)
        } catch (unregisteredHandlerException: UnregisteredHandlerException) {
            throw UnregisteredCommandException.becauseOf(command)
        }
    }

}