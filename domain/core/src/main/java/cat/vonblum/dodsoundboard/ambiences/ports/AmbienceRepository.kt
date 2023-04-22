package cat.vonblum.dodsoundboard.ambiences.ports

import cat.vonblum.dodsoundboard.ambiences.model.Ambience

interface AmbienceRepository {

    fun findAll(): List<Ambience>

}