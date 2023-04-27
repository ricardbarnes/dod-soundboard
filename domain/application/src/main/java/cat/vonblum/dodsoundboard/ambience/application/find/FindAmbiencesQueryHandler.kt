package cat.vonblum.dodsoundboard.ambience.application.find

import cat.vonblum.dodsoundboard.ambience.ports.AmbienceRepository

class FindAmbiencesQueryHandler(private val ambienceRepository: AmbienceRepository) {

    fun handle(findAmbiencesQuery: FindAmbiencesQuery): FindAmbiencesResponse =
        ambienceRepository
            .findAll(findAmbiencesQuery.limit)
            .map { ambience -> ambience.name.value }
            .let(::FindAmbiencesResponse)

}