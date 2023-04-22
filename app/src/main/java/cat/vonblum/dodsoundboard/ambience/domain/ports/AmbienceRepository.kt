package cat.vonblum.dodsoundboard.ambience.domain.ports

import cat.vonblum.dodsoundboard.ambience.domain.model.Ambience

interface AmbienceRepository {

    fun findAll(): List<Ambience>

}