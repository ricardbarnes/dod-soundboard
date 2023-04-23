package cat.vonblum.dodsoundboard.ambience.application.find

import cat.vonblum.dodsoundboard.ambience.model.Ambience
import cat.vonblum.dodsoundboard.ambience.ports.AmbienceRepository

class AllAmbiencesFinder(private val ambienceRepository: AmbienceRepository) {

    fun execute(limit: Int): List<Ambience> {
        return ambienceRepository.findAll(limit)
    }

}