package com.vonblum.dodsounds.intros

import android.content.Context
import com.vonblum.dodsounds.shared.Entity
import com.vonblum.dodsounds.shared.Playable
import com.vonblum.dodsounds.shared.soundplayer.SoundPlayer

data class Intro(
    val soundPlayer: SoundPlayer,
    val filename: IntroFilename,
    val faction: IntroFaction
) : Entity(), Playable {
    override fun play(context: Context) {
        soundPlayer.play(context, filename.value)
    }
}