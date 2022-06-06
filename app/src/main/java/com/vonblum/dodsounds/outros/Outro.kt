package com.vonblum.dodsounds.outros

import android.content.Context
import com.vonblum.dodsounds.shared.Entity
import com.vonblum.dodsounds.shared.Playable
import com.vonblum.dodsounds.shared.soundplayer.SoundPlayer

data class Outro(
    private val soundPlayer: SoundPlayer,
    private val filename: OutroFilename,
    private val faction: OutroFaction
) : Entity(), Playable {
    override fun play(context: Context) {
        soundPlayer.play(context, filename.value)
    }
}