package com.vonblum.dodsoundboard.backend.shared.infrastructure.soundplayer

import android.content.Context
import android.media.MediaPlayer
import com.vonblum.dodsoundboard.backend.shared.soundplayer.SoundPlayer

class AndroidSoundPlayer : SoundPlayer {
    override fun play(filename: String, context: Context) {
        val fileDescriptor = context.assets.openFd(filename)
        val player = MediaPlayer()

        player.setDataSource(
            fileDescriptor.fileDescriptor,
            fileDescriptor.startOffset,
            fileDescriptor.length
        )
        player.prepare()
        player.start()
    }
}