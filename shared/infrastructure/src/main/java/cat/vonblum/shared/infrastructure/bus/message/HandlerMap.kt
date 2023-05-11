package cat.vonblum.shared.infrastructure.bus.message

import cat.vonblum.shared.infrastructure.bus.exceptions.BadHandlerSuffixException
import cat.vonblum.shared.infrastructure.bus.exceptions.UnregisteredHandlerException
import cat.vonblum.shared.infrastructure.bus.message.config.HandlerConfig

class HandlerMap(
    private val handlers: List<Any>,
    private val config: HandlerConfig,
    private val value: Map<String, Any> =
        handlers.associateBy { handler ->
            handler::class.simpleName?.removeSuffix(config.handlerSuffix)
                ?: throw BadHandlerSuffixException.becauseOf(
                    handler.javaClass.simpleName,
                    config.handlerSuffix
                )
        },
) {

    fun getHandlerFor(className: String): Any = value[className]
        ?: throw UnregisteredHandlerException.becauseOf(className)

}