package cat.vonblum.shared.infrastructure.bus.message

import cat.vonblum.shared.infrastructure.bus.exceptions.BadHandlerSuffixException
import cat.vonblum.shared.infrastructure.bus.exceptions.BadSuffixException
import cat.vonblum.shared.infrastructure.bus.exceptions.HandlerMethodNotFoundException
import cat.vonblum.shared.infrastructure.bus.exceptions.UnregisteredHandlerException
import cat.vonblum.shared.infrastructure.bus.message.config.HandlerConfig
import cat.vonblum.shared.infrastructure.bus.message.config.MessageBusConfig
import cat.vonblum.shared.infrastructure.bus.message.config.MessageConfig

class MessageBus(
    handlers: List<Any>,
    private val messageBusConfig: MessageBusConfig = MessageBusConfig(
        HandlerConfig("Handler", "handle"),
        MessageConfig("Command", "Query"),
    ),
    private val handlerMap: HandlerMap = HandlerMap(handlers, messageBusConfig.handlerConfig),
) {

    @Throws(
        BadHandlerSuffixException::class,
        BadSuffixException::class,
        HandlerMethodNotFoundException::class,
        UnregisteredHandlerException::class,
    )
    fun dispatch(message: Any): Any? {
        if (!message.javaClass.simpleName.endsWith(messageBusConfig.messageConfig.commandSuffix) &&
            !message.javaClass.simpleName.endsWith(messageBusConfig.messageConfig.querySuffix)
        ) {
            throw BadSuffixException.becauseOf(
                message.javaClass.simpleName,
                messageBusConfig.messageConfig
            )
        }

        val handler = handlerMap.value[message.javaClass.simpleName]
            ?: throw UnregisteredHandlerException.becauseOf(message)

        val handleMethod =
            handler::class.java.getDeclaredMethod(
                messageBusConfig.handlerConfig.handlerMethodName,
                message::class.java
            )
                ?: throw HandlerMethodNotFoundException.becauseOf(messageBusConfig.handlerConfig.handlerMethodName)

        return handleMethod.invoke(handler, message) ?: return null
    }

}