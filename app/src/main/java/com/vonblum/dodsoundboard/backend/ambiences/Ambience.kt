package com.vonblum.dodsoundboard.backend.ambiences

import android.content.Context
import com.vonblum.dodsoundboard.backend.shared.Entity
import com.vonblum.dodsoundboard.backend.shared.Playable
import com.vonblum.dodsoundboard.backend.shared.soundplayer.SoundPlayer

data class Ambience(
    private val soundPlayer: SoundPlayer,
    private val filename: AmbienceFilename
) : Entity(), Playable {
    override fun play(context: Context) {
        soundPlayer.play(context, filename.value)
    }
}