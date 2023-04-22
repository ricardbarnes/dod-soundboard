package cat.vonblum.dodsoundboard.ambience.infrastructure.ports

import android.content.Context
import android.media.MediaPlayer
import cat.vonblum.dodsoundboard.domain.model.Ambience
import cat.vonblum.dodsoundboard.domain.ports.AmbienceProvider

class AndroidAmbienceProvider(private val context: Context) : AmbienceProvider {

    companion object {

        const val FOLDER = "ambiences"

        const val FILE_EXTENSION = "wav"

    }

    override fun send(ambience: Ambience) {
        val assetPath = FOLDER + "/" + ambience.name.value + "." + FILE_EXTENSION
        val fileDescriptor =
            context.assets.openFd(assetPath)

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