package cat.vonblum.shared.infrastructure.bus.message

import cat.vonblum.shared.infrastructure.bus.exceptions.BadSuffixException
import cat.vonblum.shared.infrastructure.bus.message.config.MessageConfig

class Message(val value: Any, messageConfig: MessageConfig) {

    init {

        if (!value.javaClass.simpleName.endsWith(messageConfig.commandSuffix) &&
            !value.javaClass.simpleName.endsWith(messageConfig.querySuffix)
        ) {
            throw BadSuffixException.becauseOf(value.javaClass.simpleName, messageConfig)
        }

    }

}