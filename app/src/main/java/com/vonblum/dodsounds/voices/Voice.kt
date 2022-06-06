package com.vonblum.dodsounds.voices

import android.content.Context
import com.vonblum.dodsounds.shared.Entity
import com.vonblum.dodsounds.shared.Playable
import com.vonblum.dodsounds.shared.soundplayer.SoundPlayer

data class Voice(
    private val soundPlayer: SoundPlayer,
    private val filename: VoiceFilename,
    private val faction: VoiceFaction
) : Entity(), Playable {
    override fun play(context: Context) {
        soundPlayer.play(context, filename.value)
    }
}