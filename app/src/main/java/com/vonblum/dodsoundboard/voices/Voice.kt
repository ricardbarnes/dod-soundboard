package com.vonblum.dodsoundboard.voices

import android.content.Context
import com.vonblum.dodsoundboard.shared.Entity
import com.vonblum.dodsoundboard.shared.Playable
import com.vonblum.dodsoundboard.shared.soundplayer.SoundPlayer

data class Voice(
    private val soundPlayer: SoundPlayer,
    private val filename: VoiceFilename,
    private val faction: VoiceFaction
) : Entity(), Playable {
    override fun play(context: Context) {
        soundPlayer.play(context, filename.value)
    }
}