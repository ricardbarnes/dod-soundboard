package cat.vonblum.shared.infrastructure.bus

import cat.vonblum.shared.infrastructure.bus.config.MessageBusConfig
import cat.vonblum.shared.infrastructure.bus.config.MessageConfig
import cat.vonblum.shared.infrastructure.bus.config.MessageHandlerConfig
import cat.vonblum.shared.infrastructure.bus.exception.BadHandlerSuffixException
import cat.vonblum.shared.infrastructure.bus.exception.BadMessageSuffixException
import cat.vonblum.shared.infrastructure.bus.exception.HandlerMethodNotFoundException
import cat.vonblum.shared.infrastructure.bus.exception.UnregisteredHandlerException
import cat.vonblum.shared.infrastructure.bus.model.Message
import cat.vonblum.shared.infrastructure.bus.model.MessageHandler
import cat.vonblum.shared.infrastructure.bus.model.MessageHandlerMap

class MessageBus(
    handlers: List<Any>,
    private val messageBusConfig: MessageBusConfig = MessageBusConfig(
        MessageHandlerConfig(
            MessageHandler.DEFAULT_HANDLER_SUFFIX,
            MessageHandler.DEFAULT_HANDLER_METHOD_NAME
        ),
        MessageConfig(Message.DEFAULT_COMMAND_SUFFIX, Message.DEFAULT_QUERY_SUFFIX),
    ),
    private val messageHandlerMap: MessageHandlerMap = MessageHandlerMap(
        handlers,
        messageBusConfig.messageHandlerConfig
    ),
) {

    @Throws(
        BadHandlerSuffixException::class,
        BadMessageSuffixException::class,
        HandlerMethodNotFoundException::class,
        UnregisteredHandlerException::class,
    )
    fun dispatch(message: Any): Any? =
        send(Message(message, messageBusConfig.messageConfig))

    private fun send(message: Message): Any? =
        messageHandlerMap.getHandlerMethodFor(message.value.javaClass).invoke(
            messageHandlerMap.getHandlerFor(message.value.javaClass.simpleName),
            message.value
        ) ?: null

}