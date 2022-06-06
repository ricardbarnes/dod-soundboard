package com.vonblum.dodsoundboard.shared.soundplayer

import android.content.Context

interface SoundPlayer {

    fun play(context: Context, filename: String)

}