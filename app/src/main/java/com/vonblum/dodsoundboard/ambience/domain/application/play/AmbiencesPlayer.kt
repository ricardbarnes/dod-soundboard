package com.vonblum.dodsoundboard.ambience.domain.application.play

import com.vonblum.dodsoundboard.ambience.domain.model.Ambience
import com.vonblum.dodsoundboard.ambience.domain.ports.AmbiencePlayer

class AmbiencesPlayer(private val player: AmbiencePlayer) {

    fun run(ambience: Ambience) {
        player.play(ambience)
    }

}