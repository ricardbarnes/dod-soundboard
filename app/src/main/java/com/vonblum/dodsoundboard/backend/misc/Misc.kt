package com.vonblum.dodsoundboard.backend.misc

import android.content.Context
import com.vonblum.dodsoundboard.backend.shared.Entity
import com.vonblum.dodsoundboard.backend.shared.Playable
import com.vonblum.dodsoundboard.backend.shared.soundplayer.SoundPlayer

class Misc(
    private val soundPlayer: SoundPlayer,
    private val filename: MiscFilename
) : Entity(), Playable {
    override fun play(context: Context) {
        soundPlayer.play(context, filename.value)
    }
}