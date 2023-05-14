package cat.vonblum.shared.infrastructure.bus.model

import cat.vonblum.shared.infrastructure.bus.config.MessageConfig
import cat.vonblum.shared.infrastructure.bus.exception.BadMessageSuffixException

class Message(val value: Any, messageConfig: MessageConfig) {

    companion object {

        const val DEFAULT_COMMAND_SUFFIX = "Command"

        const val DEFAULT_QUERY_SUFFIX = "Query"

    }

    init {

        if (!value.javaClass.simpleName.endsWith(messageConfig.commandSuffix) &&
            !value.javaClass.simpleName.endsWith(messageConfig.querySuffix)
        ) {
            throw BadMessageSuffixException.becauseOf(value.javaClass.simpleName, messageConfig)
        }

    }

}