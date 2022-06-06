package com.vonblum.dodsoundboard.backend.shared.soundplayer

import android.content.Context

interface SoundPlayer {

    fun play(context: Context, filename: String)

}