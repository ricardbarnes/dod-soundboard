package cat.vonblum.dodsoundboard.shared.bus.query

import cat.vonblum.dodsoundboard.shared.domain.bus.query.Query

class UnregisteredQueryException private constructor(override val message: String) :
    RuntimeException(message) {

    companion object {

        fun becauseOf(query: Query) =
            UnregisteredQueryException("Query class \"${query.javaClass.simpleName}\" is not registered.")

    }

}