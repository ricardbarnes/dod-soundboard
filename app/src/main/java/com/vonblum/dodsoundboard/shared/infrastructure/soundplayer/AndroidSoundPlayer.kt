package com.vonblum.dodsoundboard.shared.infrastructure.soundplayer

import android.content.Context
import android.media.MediaPlayer
import com.vonblum.dodsoundboard.shared.soundplayer.SoundPlayer

class AndroidSoundPlayer : SoundPlayer {
    override fun play(context: Context, filename: String) {
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