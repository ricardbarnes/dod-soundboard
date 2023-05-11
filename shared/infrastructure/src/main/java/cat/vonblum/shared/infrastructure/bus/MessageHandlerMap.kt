package cat.vonblum.shared.infrastructure.bus

import cat.vonblum.shared.infrastructure.bus.config.MessageHandlerConfig
import cat.vonblum.shared.infrastructure.bus.exception.HandlerMethodNotFoundException
import cat.vonblum.shared.infrastructure.bus.exception.UnregisteredHandlerException
import java.lang.reflect.Method

class MessageHandlerMap(
    private val handlers: List<Any>,
    private val config: MessageHandlerConfig,
    private val value: Map<String, Any> =
        handlers.associateBy { handler ->
            MessageHandler(
                handler,
                config
            ).value.javaClass.simpleName.removeSuffix(config.handlerSuffix)
        },
) {

    fun getHandlerFor(className: String): Any = value[className]
        ?: throw UnregisteredHandlerException.becauseOf(className)

    fun getHandlerMethodFor(messageClass: Class<Any>): Method =
        value[messageClass.simpleName]
            ?.let { handler ->
                handler::class.java.getDeclaredMethod(config.handlerMethodName, messageClass)
            }
            ?: throw HandlerMethodNotFoundException.becauseOf(config.handlerMethodName)

}