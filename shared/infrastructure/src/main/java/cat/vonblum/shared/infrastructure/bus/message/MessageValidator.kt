package cat.vonblum.shared.infrastructure.bus.message

import cat.vonblum.shared.infrastructure.bus.exceptions.BadSuffixException
import cat.vonblum.shared.infrastructure.bus.message.config.MessageConfig

class MessageValidator(private val messageConfig: MessageConfig) {

    fun validate(className: String) {
        if (!className.endsWith(messageConfig.commandSuffix) &&
            !className.endsWith(messageConfig.querySuffix)
        ) {
            throw BadSuffixException.becauseOf(className, messageConfig)
        }
    }

}