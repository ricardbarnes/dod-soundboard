package cat.vonblum.shared.infrastructure.bus.message

import cat.vonblum.shared.infrastructure.bus.exceptions.BadHandlerSuffixException
import cat.vonblum.shared.infrastructure.bus.message.config.HandlerConfig

class HandlerMap(
    private val handlers: List<Any>,
    private val config: HandlerConfig,
    val value: Map<String, Any> =
        handlers.associateBy { handler ->
            handler::class.simpleName?.removeSuffix(config.handlerSuffix)
                ?: throw BadHandlerSuffixException.becauseOf(
                    handler.javaClass.simpleName,
                    config.handlerSuffix
                )
        },
)