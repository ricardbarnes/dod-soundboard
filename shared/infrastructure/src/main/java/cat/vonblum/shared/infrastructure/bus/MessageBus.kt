package cat.vonblum.shared.infrastructure.bus

import cat.vonblum.shared.infrastructure.bus.config.MessageBusConfig
import cat.vonblum.shared.infrastructure.bus.config.MessageConfig
import cat.vonblum.shared.infrastructure.bus.config.MessageHandlerConfig
import cat.vonblum.shared.infrastructure.bus.exception.BadHandlerSuffixException
import cat.vonblum.shared.infrastructure.bus.exception.BadMessageSuffixException
import cat.vonblum.shared.infrastructure.bus.exception.HandlerMethodNotFoundException
import cat.vonblum.shared.infrastructure.bus.exception.UnregisteredHandlerException

class MessageBus(
    handlers: List<Any>,
    private val messageBusConfig: MessageBusConfig = MessageBusConfig(
        MessageHandlerConfig("Handler", "handle"),
        MessageConfig("Command", "Query"),
    ),
    private val messageHandlerMap: MessageHandlerMap = MessageHandlerMap(
        handlers,
        messageBusConfig.messageHandlerConfig
    ),
    private val messageDispatcher: MessageDispatcher = MessageDispatcher(messageHandlerMap),
) {

    @Throws(
        BadHandlerSuffixException::class,
        BadMessageSuffixException::class,
        HandlerMethodNotFoundException::class,
        UnregisteredHandlerException::class,
    )
    fun dispatch(message: Any): Any? =
        messageDispatcher.dispatch(Message(message, messageBusConfig.messageConfig))

}