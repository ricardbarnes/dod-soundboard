package com.vonblum.dodsoundboard.backend.outros

import android.content.Context
import com.vonblum.dodsoundboard.backend.shared.Entity
import com.vonblum.dodsoundboard.backend.shared.Playable
import com.vonblum.dodsoundboard.backend.shared.soundplayer.SoundPlayer

data class Outro(
    private val soundPlayer: SoundPlayer,
    private val filename: OutroFilename,
    private val faction: OutroFaction
) : Entity(), Playable {
    override fun play(context: Context) {
        soundPlayer.play(context, filename.value)
    }
}