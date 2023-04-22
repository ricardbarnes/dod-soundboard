package cat.vonblum.dodsoundboard.ambiences.application.play

import cat.vonblum.dodsoundboard.ambiences.model.Ambience
import cat.vonblum.dodsoundboard.ambiences.ports.AmbienceProvider

class AmbiencePlayer(private val ambienceProvider: AmbienceProvider) {

    fun execute(ambience: Ambience) {
        ambienceProvider.send(ambience)
    }

}