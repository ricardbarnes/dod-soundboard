package cat.vonblum.dodsoundboard.domain.core.ports

import cat.vonblum.dodsoundboard.domain.core.model.Ambience

interface AmbienceProvider {

    fun send(ambience: Ambience)

}