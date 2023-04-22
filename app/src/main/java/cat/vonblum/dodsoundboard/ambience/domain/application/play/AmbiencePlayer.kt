package cat.vonblum.dodsoundboard.ambience.domain.application.play

import cat.vonblum.dodsoundboard.ambience.domain.model.Ambience
import cat.vonblum.dodsoundboard.ambience.domain.ports.AmbienceProvider

class AmbiencePlayer(private val ambienceProvider: AmbienceProvider) {

    fun execute(ambience: Ambience) {
        ambienceProvider.send(ambience)
    }

}