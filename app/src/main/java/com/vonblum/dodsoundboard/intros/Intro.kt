package com.vonblum.dodsoundboard.intros

import android.content.Context
import com.vonblum.dodsoundboard.shared.Entity
import com.vonblum.dodsoundboard.shared.Playable
import com.vonblum.dodsoundboard.shared.soundplayer.SoundPlayer

data class Intro(
    private val soundPlayer: SoundPlayer,
    private val filename: IntroFilename,
    private val faction: IntroFaction
) : Entity(), Playable {
    override fun play(context: Context) {
        soundPlayer.play(context, filename.value)
    }
}