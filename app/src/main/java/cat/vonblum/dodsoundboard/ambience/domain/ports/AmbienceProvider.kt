package cat.vonblum.dodsoundboard.ambience.domain.ports

import cat.vonblum.dodsoundboard.ambience.domain.model.Ambience

interface AmbienceProvider {

    fun send(ambience: Ambience)

}