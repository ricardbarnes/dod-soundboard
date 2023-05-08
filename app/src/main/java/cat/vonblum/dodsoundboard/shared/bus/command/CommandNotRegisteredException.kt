package cat.vonblum.dodsoundboard.shared.bus.command

import cat.vonblum.dodsoundboard.shared.domain.bus.command.Command

class CommandNotRegisteredException private constructor(override val message: String) :
    RuntimeException(message) {

    companion object {

        fun becauseOf(command: Command) =
            CommandNotRegisteredException("Command class \"${command.javaClass.simpleName}\"")

    }

}