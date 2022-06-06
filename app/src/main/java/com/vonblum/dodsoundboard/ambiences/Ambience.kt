package com.vonblum.dodsoundboard.ambiences

import android.content.Context
import com.vonblum.dodsoundboard.shared.Entity
import com.vonblum.dodsoundboard.shared.Playable
import com.vonblum.dodsoundboard.shared.soundplayer.SoundPlayer

data class Ambience(
    private val soundPlayer: SoundPlayer,
    private val filename: AmbienceFilename
) : Entity(), Playable {
    override fun play(context: Context) {
        soundPlayer.play(context, filename.value)
    }
}