package com.vonblum.dodsoundboard.outros

import android.content.Context
import com.vonblum.dodsoundboard.shared.Entity
import com.vonblum.dodsoundboard.shared.Playable
import com.vonblum.dodsoundboard.shared.soundplayer.SoundPlayer

data class Outro(
    private val soundPlayer: SoundPlayer,
    private val filename: OutroFilename,
    private val faction: OutroFaction
) : Entity(), Playable {
    override fun play(context: Context) {
        soundPlayer.play(context, filename.value)
    }
}