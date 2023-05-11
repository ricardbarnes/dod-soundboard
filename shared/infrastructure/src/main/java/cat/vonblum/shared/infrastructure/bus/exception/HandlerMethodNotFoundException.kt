package cat.vonblum.shared.infrastructure.bus.exception

class HandlerMethodNotFoundException private constructor(override val message: String) :
    RuntimeException(message) {

    companion object {

        fun becauseOf(expectedMethodName: String) =
            HandlerMethodNotFoundException("Expected handler method \"$expectedMethodName\" not found.")

    }

}