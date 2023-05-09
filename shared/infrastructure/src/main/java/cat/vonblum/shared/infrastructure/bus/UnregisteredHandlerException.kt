package cat.vonblum.shared.infrastructure.bus

class UnregisteredHandlerException private constructor(override val message: String) :
    RuntimeException(message) {

    companion object {

        fun becauseOf(any: Any) =
            UnregisteredHandlerException("Handler class \"${any.javaClass.simpleName}\" is not registered.")

    }

}