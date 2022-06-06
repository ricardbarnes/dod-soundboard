package com.vonblum.dodsounds.intros

import android.content.Context
import com.vonblum.dodsounds.shared.Entity
import com.vonblum.dodsounds.shared.Playable
import com.vonblum.dodsounds.shared.soundplayer.SoundPlayer

data class Intro(
    private val soundPlayer: SoundPlayer,
    private val filename: IntroFilename,
    private val faction: IntroFaction
) : Entity(), Playable {
    override fun play(context: Context) {
        soundPlayer.play(context, filename.value)
    }
}