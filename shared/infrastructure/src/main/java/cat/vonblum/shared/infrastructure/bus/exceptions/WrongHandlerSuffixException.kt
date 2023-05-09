package cat.vonblum.shared.infrastructure.bus.exceptions

class WrongHandlerSuffixException private constructor(override val message: String) :
    RuntimeException(message) {

    companion object {

        fun becauseOf(className: String, expectedClassSuffix: String) =
            WrongHandlerSuffixException("Wrong handler suffix for class name \"$className\". Expected \"$expectedClassSuffix\"")

    }

}