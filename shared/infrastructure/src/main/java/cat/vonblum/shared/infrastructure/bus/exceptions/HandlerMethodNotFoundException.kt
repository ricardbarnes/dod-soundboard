package cat.vonblum.shared.infrastructure.bus.exceptions

class HandlerMethodNotFoundException private constructor(override val message: String) :
    RuntimeException(message) {

    companion object {

        fun becauseOf(expectedMethodName: String) =
            HandlerMethodNotFoundException("Expected handler method \"$expectedMethodName\" not found.")

    }

}