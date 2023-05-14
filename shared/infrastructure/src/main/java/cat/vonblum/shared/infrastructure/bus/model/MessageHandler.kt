package cat.vonblum.shared.infrastructure.bus.model

import cat.vonblum.shared.infrastructure.bus.config.MessageHandlerConfig
import cat.vonblum.shared.infrastructure.bus.exception.BadHandlerSuffixException

class MessageHandler(val value: Any, config: MessageHandlerConfig) {

    init {

        if (!value.javaClass.simpleName.endsWith(config.handlerSuffix)) {
            throw BadHandlerSuffixException.becauseOf(
                value.javaClass.simpleName,
                config.handlerSuffix
            )
        }

    }

}