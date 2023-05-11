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
    private val messageDispatcher: MessageDispatcher = MessageDispatcher(handlerMap),
) {

    @Throws(
        BadHandlerSuffixException::class,
        BadSuffixException::class,
        HandlerMethodNotFoundException::class,
        UnregisteredHandlerException::class,
    )
    fun dispatch(message: Any): Any? =
        messageDispatcher.dispatch(Message(message, messageBusConfig.messageConfig))

}