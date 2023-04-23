package cat.vonblum.dodsoundboard.ambience.application.find

import cat.vonblum.dodsoundboard.shared.domain.bus.query.QueryHandler

class AllAmbiencesFinderQueryHandler(private val allAmbiencesFinder: AllAmbiencesFinder) :
    QueryHandler {

    fun handleSynchronously(findAllAmbiencesQuery: FindAllAmbiencesQuery): FindAllAmbiencesResponse {
        return FindAllAmbiencesResponse(allAmbiencesFinder.execute(findAllAmbiencesQuery.limit).map { it.name.value })
    }

}