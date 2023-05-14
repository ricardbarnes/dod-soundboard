package cat.vonblum.shared.infrastructure.bus.model

import cat.vonblum.shared.infrastructure.bus.config.MessageHandlerConfig
import cat.vonblum.shared.infrastructure.bus.exception.BadHandlerSuffixException

class MessageHandler(val value: Any, config: MessageHandlerConfig) {

    companion object {

        const val DEFAULT_HANDLER_SUFFIX = "Handler"

        const val DEFAULT_HANDLER_METHOD_NAME = "handle"

    }

    init {

        if (!value.javaClass.simpleName.endsWith(config.handlerSuffix)) {
            throw BadHandlerSuffixException.becauseOf(
                value.javaClass.simpleName,
                config.handlerSuffix
            )
        }

    }

}