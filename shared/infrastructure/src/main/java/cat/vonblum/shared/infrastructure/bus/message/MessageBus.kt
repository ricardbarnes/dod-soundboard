package cat.vonblum.shared.infrastructure.bus.message

import cat.vonblum.shared.infrastructure.bus.exceptions.HandlerMethodNotFoundException
import cat.vonblum.shared.infrastructure.bus.exceptions.UnnamedClassException
import cat.vonblum.shared.infrastructure.bus.exceptions.UnregisteredHandlerException
import cat.vonblum.shared.infrastructure.bus.exceptions.WrongHandlerSuffixException

class MessageBus(
    handlers: List<Any>,
    private val handlerSuffix: String = "Handler",
    private val handlerMethodName: String = "handle",
) {

    private val handlerMap: Map<String, Any> =
        handlers.associateBy { handler ->
            handler::class.simpleName?.removeSuffix(handlerSuffix) ?: throw UnnamedClassException()
        }

    @Throws(
        UnregisteredHandlerException::class,
        WrongHandlerSuffixException::class,
        HandlerMethodNotFoundException::class
    )
    fun dispatch(message: Any): Any? {
        val handler = handlerMap[message.javaClass.simpleName]
            ?: throw UnregisteredHandlerException.becauseOf(message)

        if (!handler.javaClass.simpleName.endsWith(handlerSuffix)) {
            throw WrongHandlerSuffixException.becauseOf(handler.javaClass.simpleName, handlerSuffix)
        }

        val handleMethod =
            handler::class.java.getDeclaredMethod(handlerMethodName, message::class.java)
                ?: throw HandlerMethodNotFoundException.becauseOf(handlerMethodName)

        return handleMethod.invoke(handler, message) ?: return null
    }

}