package cat.vonblum.shared.infrastructure.bus.message

class MessageDispatcher(private val handlerMap: HandlerMap) {

    fun dispatch(message: Message): Any? =
        handlerMap.getHandlerMethodFor(message.value.javaClass).invoke(
            handlerMap.getHandlerFor(message.value.javaClass.simpleName),
            message.value
        ) ?: null

}