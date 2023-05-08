package cat.vonblum.dodsoundboard.shared.bus.query

import cat.vonblum.dodsoundboard.shared.domain.bus.query.Query
import cat.vonblum.dodsoundboard.shared.domain.bus.query.QueryBus
import cat.vonblum.dodsoundboard.shared.domain.bus.query.QueryHandler
import cat.vonblum.dodsoundboard.shared.domain.bus.query.Response

class InMemoryQueryBus(queryHandlers: List<QueryHandler>) : QueryBus {

    private val queryHandlerMap: Map<String, QueryHandler> =
        queryHandlers.associateBy { queryHandler ->
            queryHandler::class.simpleName?.removeSuffix("Handler")
                ?: throw RuntimeException("Query handler has no simple name")
        }

    override fun ask(query: Query): Response? {
        val queryName = query.javaClass.simpleName

        if (!queryHandlerMap.containsKey(queryName)) {
            throw QueryNotRegisteredException.becauseOf(query)
        }

        val queryHandler = queryHandlerMap[queryName]
        val handleMethod = queryHandler?.javaClass?.getDeclaredMethod("handle", query.javaClass)
        return handleMethod?.invoke(queryHandler, query) as Response?
    }

}