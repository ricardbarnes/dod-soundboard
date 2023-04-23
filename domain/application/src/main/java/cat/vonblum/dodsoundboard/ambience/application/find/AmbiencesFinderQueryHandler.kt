package cat.vonblum.dodsoundboard.ambience.application.find

import cat.vonblum.dodsoundboard.shared.domain.bus.query.QueryHandler

class AmbiencesFinderQueryHandler(private val ambiencesFinder: AmbiencesFinder) : QueryHandler {

    fun handleSynchronously(ambiencesQuery: FindAmbiencesQuery): FoundAmbiencesResponse {
        return FoundAmbiencesResponse(ambiencesFinder.execute().map { it.name.value })
    }

}