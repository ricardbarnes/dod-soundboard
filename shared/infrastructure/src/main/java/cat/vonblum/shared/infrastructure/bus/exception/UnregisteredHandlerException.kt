package cat.vonblum.shared.infrastructure.bus.exception

class UnregisteredHandlerException private constructor(override val message: String) :
    RuntimeException(message) {

    companion object {

        fun becauseOf(className: String) =
            UnregisteredHandlerException("Handler class \"$className\" is not registered.")

    }

}