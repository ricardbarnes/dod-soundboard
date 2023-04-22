package cat.vonblum.dodsoundboard.ambience.ports

import cat.vonblum.dodsoundboard.ambience.model.Ambience

interface AmbienceProvider {

    fun send(ambience: Ambience)

}