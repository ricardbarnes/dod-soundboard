package cat.vonblum.shared.infrastructure.bus.message

import cat.vonblum.shared.infrastructure.bus.exceptions.BadSuffixException
import cat.vonblum.shared.infrastructure.bus.exceptions.HandlerMethodNotFoundException
import cat.vonblum.shared.infrastructure.bus.exceptions.UnnamedClassException
import cat.vonblum.shared.infrastructure.bus.exceptions.UnregisteredHandlerException
import cat.vonblum.shared.infrastructure.bus.exceptions.WrongHandlerSuffixException
import cat.vonblum.shared.infrastructure.bus.message.config.HandlerConfig
import cat.vonblum.shared.infrastructure.bus.message.config.MessageConfig

class MessageBus(
    handlers: List<Any>,
    private val handlerConfig: HandlerConfig = HandlerConfig("Handler", "handle"),
    private val messageConfig: MessageConfig = MessageConfig("Command", "Query"),
) {

    private val handlerMap: Map<String, Any> =
        handlers.associateBy { handler ->
            handler::class.simpleName?.removeSuffix(handlerConfig.handlerSuffix)
                ?: throw UnnamedClassException()
        }

    @Throws(
        UnregisteredHandlerException::class,
        WrongHandlerSuffixException::class,
        HandlerMethodNotFoundException::class
    )
    fun dispatch(message: Any): Any? {
        if (!message.javaClass.simpleName.endsWith(this.messageConfig.commandSuffix) &&
            !message.javaClass.simpleName.endsWith(this.messageConfig.querySuffix)
        ) {
            throw BadSuffixException.becauseOf(message.javaClass.simpleName, this.messageConfig)
        }

        val handler = handlerMap[message.javaClass.simpleName]
            ?: throw UnregisteredHandlerException.becauseOf(message)

        if (!handler.javaClass.simpleName.endsWith(handlerConfig.handlerSuffix)) {
            throw WrongHandlerSuffixException.becauseOf(
                handler.javaClass.simpleName,
                handlerConfig.handlerSuffix
            )
        }

        val handleMethod =
            handler::class.java.getDeclaredMethod(
                handlerConfig.handlerMethodName,
                message::class.java
            ) ?: throw HandlerMethodNotFoundException.becauseOf(handlerConfig.handlerMethodName)

        return handleMethod.invoke(handler, message) ?: return null
    }

}