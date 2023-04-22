package cat.vonblum.dodsoundboard.domain.ports

import cat.vonblum.dodsoundboard.domain.model.Ambience

interface AmbienceRepository {

    fun findAll(): List<Ambience>

}