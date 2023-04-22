package cat.vonblum.dodsoundboard.domain.ports

import cat.vonblum.dodsoundboard.domain.model.Ambience

interface AmbienceProvider {

    fun send(ambience: Ambience)

}