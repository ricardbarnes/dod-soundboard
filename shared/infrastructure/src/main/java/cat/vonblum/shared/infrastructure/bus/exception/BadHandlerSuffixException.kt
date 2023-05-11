package cat.vonblum.shared.infrastructure.bus.exception

class BadHandlerSuffixException private constructor(override val message: String) :
    RuntimeException(message) {

    companion object {

        fun becauseOf(className: String, expectedClassSuffix: String) =
            BadHandlerSuffixException("Wrong handler suffix for class name \"$className\". Expected \"$expectedClassSuffix\"")

    }

}