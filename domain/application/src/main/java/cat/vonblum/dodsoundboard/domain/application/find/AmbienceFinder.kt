package cat.vonblum.dodsoundboard.domain.application.find

import cat.vonblum.dodsoundboard.domain.core.model.Ambience
import cat.vonblum.dodsoundboard.domain.core.ports.AmbienceRepository

class AmbienceFinder(private val repository: AmbienceRepository) {

    fun execute(): List<Ambience> {
        return repository.findAll()
    }

}