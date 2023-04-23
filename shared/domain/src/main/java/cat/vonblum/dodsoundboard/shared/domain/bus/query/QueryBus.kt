package cat.vonblum.dodsoundboard.shared.domain.bus.query

interface QueryBus {

    fun ask(query: Query): Response?

}