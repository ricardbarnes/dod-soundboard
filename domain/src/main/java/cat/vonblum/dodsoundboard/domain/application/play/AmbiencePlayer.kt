package cat.vonblum.dodsoundboard.domain.application.play

import cat.vonblum.dodsoundboard.domain.model.Ambience
import cat.vonblum.dodsoundboard.domain.ports.AmbienceProvider

class AmbiencePlayer(private val ambienceProvider: AmbienceProvider) {

    fun execute(ambience: Ambience) {
        ambienceProvider.send(ambience)
    }

}