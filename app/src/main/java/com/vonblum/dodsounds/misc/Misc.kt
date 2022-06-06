package com.vonblum.dodsounds.misc

import android.content.Context
import com.vonblum.dodsounds.shared.Entity
import com.vonblum.dodsounds.shared.Playable
import com.vonblum.dodsounds.shared.soundplayer.SoundPlayer

class Misc(
    val soundPlayer: SoundPlayer,
    val filename: MiscFilename
) : Entity(), Playable {
    override fun play(context: Context) {
        soundPlayer.play(context, filename.value)
    }
}