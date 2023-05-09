package cat.vonblum.shared.infrastructure.bus

class MessageBus(
    handlers: List<Any>,
    handlerSuffix: String = "Handler",
    private val handlerMethodName: String = "handle",
) {

    private val handlerMap: Map<String, Any> =
        handlers.associateBy { handler ->
            handler::class.simpleName?.removeSuffix(handlerSuffix) ?: throw UnnamedClassException()
        }

    @Throws(UnregisteredHandlerException::class)
    fun dispatch(message: Any): Any? {
        val messageClass = message.javaClass
        val messageClassName = messageClass.simpleName

        if (!handlerMap.containsKey(messageClassName)) {
            throw UnregisteredHandlerException.becauseOf(message)
        }

        val handler = handlerMap[messageClassName]
        val handleMethod = handler?.javaClass?.getDeclaredMethod(handlerMethodName, messageClass)

        return handleMethod?.invoke(handler, message) ?: return null
    }

}