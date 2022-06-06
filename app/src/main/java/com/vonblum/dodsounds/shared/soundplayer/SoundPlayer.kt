package com.vonblum.dodsounds.shared.soundplayer

import android.content.Context

interface SoundPlayer {

    fun play(context: Context, filename: String)

}