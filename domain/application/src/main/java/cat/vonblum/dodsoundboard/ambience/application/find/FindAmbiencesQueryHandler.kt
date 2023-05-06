package cat.vonblum.dodsoundboard.ambience.application.find

import cat.vonblum.dodsoundboard.ambience.ports.AmbienceRepository
import cat.vonblum.dodsoundboard.shared.domain.bus.query.QueryHandler

class FindAmbiencesQueryHandler(private val ambienceRepository: AmbienceRepository): QueryHandler {

    fun handle(findAmbiencesQuery: FindAmbiencesQuery): FindAmbiencesResponse? =
        ambienceRepository
            .findAll(findAmbiencesQuery.limit)
            .takeIf { it.isNotEmpty() }
            ?.map { ambience -> ambience.name.value }
            ?.let(::FindAmbiencesResponse)

}