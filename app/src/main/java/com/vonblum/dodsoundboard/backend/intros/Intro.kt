package com.vonblum.dodsoundboard.backend.intros

import android.content.Context
import com.vonblum.dodsoundboard.backend.shared.Entity
import com.vonblum.dodsoundboard.backend.shared.Playable
import com.vonblum.dodsoundboard.backend.shared.soundplayer.SoundPlayer

data class Intro(
    private val soundPlayer: SoundPlayer,
    private val filename: IntroFilename,
    private val faction: IntroFaction
) : Entity(), Playable {
    override fun play(context: Context) {
        soundPlayer.play(context, filename.value)
    }
}