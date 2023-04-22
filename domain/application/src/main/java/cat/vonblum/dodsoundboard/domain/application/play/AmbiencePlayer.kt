package cat.vonblum.dodsoundboard.domain.application.play

import cat.vonblum.dodsoundboard.domain.core.model.Ambience
import cat.vonblum.dodsoundboard.domain.core.ports.AmbienceProvider

class AmbiencePlayer(private val ambienceProvider: AmbienceProvider) {

    fun execute(ambience: Ambience) {
        ambienceProvider.send(ambience)
    }

}