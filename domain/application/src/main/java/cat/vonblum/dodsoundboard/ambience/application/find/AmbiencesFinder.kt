package cat.vonblum.dodsoundboard.ambience.application.find

import cat.vonblum.dodsoundboard.ambience.model.Ambience
import cat.vonblum.dodsoundboard.ambience.ports.AmbienceRepository

class AmbiencesFinder(private val ambienceRepository: AmbienceRepository) {

    fun execute(): List<Ambience> {
        return ambienceRepository.findAll()
    }

}