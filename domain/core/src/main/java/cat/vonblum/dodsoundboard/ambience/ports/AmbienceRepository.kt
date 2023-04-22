package cat.vonblum.dodsoundboard.ambience.ports

import cat.vonblum.dodsoundboard.ambience.model.Ambience

interface AmbienceRepository {

    fun findAll(): List<Ambience>

}