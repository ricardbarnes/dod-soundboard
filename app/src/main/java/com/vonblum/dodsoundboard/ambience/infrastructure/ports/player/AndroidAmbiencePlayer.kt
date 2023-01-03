package com.vonblum.dodsoundboard.ambience.infrastructure.ports.player

import android.content.Context
import android.media.MediaPlayer
import com.vonblum.dodsoundboard.ambience.domain.model.Ambience
import com.vonblum.dodsoundboard.ambience.domain.ports.AmbiencePlayer

class AndroidAmbiencePlayer : AmbiencePlayer {

    override fun play(ambience: Ambience, context: Context) {
        val fileDescriptor = context.assets.openFd(ambience.uri.value.path)
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