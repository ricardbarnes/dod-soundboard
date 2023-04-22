package cat.vonblum.dodsoundboard.ambiences.application.find

import cat.vonblum.dodsoundboard.ambiences.model.Ambience
import cat.vonblum.dodsoundboard.ambiences.ports.AmbienceRepository

class AmbienceFinder(private val repository: AmbienceRepository) {

    fun execute(): List<Ambience> {
        return repository.findAll()
    }

}