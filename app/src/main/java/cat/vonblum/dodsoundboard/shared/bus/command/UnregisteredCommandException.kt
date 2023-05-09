package cat.vonblum.dodsoundboard.shared.bus.command

import cat.vonblum.dodsoundboard.shared.domain.bus.command.Command

class UnregisteredCommandException private constructor(override val message: String) :
    RuntimeException(message) {

    companion object {

        fun becauseOf(command: Command) =
            UnregisteredCommandException("Command class \"${command.javaClass.simpleName}\"")

    }

}