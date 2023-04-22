package com.vonblum.dodsoundboard.ambience.domain.application.play

import com.vonblum.dodsoundboard.ambience.domain.model.Ambience
import com.vonblum.dodsoundboard.ambience.domain.ports.AmbienceProvider

class AmbiencePlayer(private val ambienceProvider: AmbienceProvider) {

    fun execute(ambience: Ambience) {
        ambienceProvider.send(ambience)
    }

}