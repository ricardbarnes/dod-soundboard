package cat.vonblum.dodsoundboard.shared.bus.query

interface QueryBus {

    fun ask(query: Query): Response?

}