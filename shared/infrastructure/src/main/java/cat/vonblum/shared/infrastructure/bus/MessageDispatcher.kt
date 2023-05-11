package cat.vonblum.shared.infrastructure.bus

class MessageDispatcher(private val messageHandlerMap: MessageHandlerMap) {

    fun dispatch(message: Message): Any? =
        messageHandlerMap.getHandlerMethodFor(message.value.javaClass).invoke(
            messageHandlerMap.getHandlerFor(message.value.javaClass.simpleName),
            message.value
        ) ?: null

}