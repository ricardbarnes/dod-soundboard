package cat.vonblum.shared.infrastructure.bus.exception

import cat.vonblum.shared.infrastructure.bus.config.MessageConfig

class BadMessageSuffixException private constructor(override val message: String) :
    RuntimeException(message) {

    companion object {

        fun becauseOf(message: String, messageConfig: MessageConfig) =
            BadMessageSuffixException("Bad suffix for message: \"$message\". Allowed suffixes are \"${messageConfig.commandSuffix}\" for commands and \"${messageConfig.querySuffix}\" for queries.")

    }

}