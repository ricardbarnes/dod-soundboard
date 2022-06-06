package com.vonblum.dodsounds.ambiences

import android.content.Context
import com.vonblum.dodsounds.shared.Entity
import com.vonblum.dodsounds.shared.Playable
import com.vonblum.dodsounds.shared.soundplayer.SoundPlayer

data class Ambience(
    val soundPlayer: SoundPlayer,
    val filename: AmbienceFilename
) : Entity(), Playable {
    override fun play(context: Context) {
        soundPlayer.play(context, filename.value)
    }
}