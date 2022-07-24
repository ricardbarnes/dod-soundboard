package com.vonblum.dodsoundboard.backend.ambiences.application.play

import android.content.Context
import com.vonblum.dodsoundboard.backend.ambiences.domain.Ambience
import com.vonblum.dodsoundboard.backend.shared.soundplayer.SoundPlayer

class AmbiencePlayer(
    private val soundPlayer: SoundPlayer,
    private val context: Context
) {
    fun main(ambience: Ambience) {
        val filename = ambience.filename().value
        soundPlayer.play(filename, context)
    }
}