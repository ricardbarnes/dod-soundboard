package cat.vonblum.dodsoundboard.shared.bus.query

import cat.vonblum.dodsoundboard.shared.domain.bus.query.Query
import cat.vonblum.dodsoundboard.shared.domain.bus.query.QueryBus
import cat.vonblum.dodsoundboard.shared.domain.bus.query.QueryHandler
import cat.vonblum.dodsoundboard.shared.domain.bus.query.Response
import cat.vonblum.shared.infrastructure.bus.MessageBus
import cat.vonblum.shared.infrastructure.bus.exception.UnregisteredHandlerException

class InMemoryQueryBus(queryHandlers: List<QueryHandler>) : QueryBus {

    private val messageBus = MessageBus(queryHandlers)

    override fun ask(query: Query): Response? {
        val response: Any?

        try {
            response = messageBus.dispatch(query)
        } catch (unregisteredHandlerException: UnregisteredHandlerException) {
            throw UnregisteredQueryException.becauseOf(query)
        }

        return response as Response?
    }

}