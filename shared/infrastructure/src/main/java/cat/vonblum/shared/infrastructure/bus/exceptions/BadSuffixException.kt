package cat.vonblum.shared.infrastructure.bus.exceptions

import cat.vonblum.shared.infrastructure.bus.message.config.MessageConfig

class BadSuffixException private constructor(override val message: String) :
    RuntimeException(message) {

    companion object {

        fun becauseOf(message: String, messageConfig: MessageConfig) =
            BadSuffixException("Bad suffix for message: \"$message\". Allowed suffixes are \"${messageConfig.commandSuffix}\" for commands and \"${messageConfig.querySuffix}\" for queries.")

    }

}