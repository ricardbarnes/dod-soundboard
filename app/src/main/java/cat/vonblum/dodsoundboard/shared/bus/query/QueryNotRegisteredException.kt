package cat.vonblum.dodsoundboard.shared.bus.query

import cat.vonblum.dodsoundboard.shared.domain.bus.query.Query

class QueryNotRegisteredException private constructor(override val message: String) :
    RuntimeException(message) {

    companion object {

        fun becauseOf(query: Query) =
            QueryNotRegisteredException("Query class \"${query.javaClass.simpleName}\" is not registered.")

    }

}