package cat.vonblum.dodsoundboard.ambiences.ports

import cat.vonblum.dodsoundboard.ambiences.model.Ambience

interface AmbienceProvider {

    fun send(ambience: Ambience)

}