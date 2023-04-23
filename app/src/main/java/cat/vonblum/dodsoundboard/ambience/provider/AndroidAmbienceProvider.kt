package cat.vonblum.dodsoundboard.ambience.provider

import android.content.Context
import android.media.MediaPlayer
import cat.vonblum.dodsoundboard.ambience.model.Ambience
import cat.vonblum.dodsoundboard.ambience.ports.AmbienceProvider

class AndroidAmbienceProvider(
    private val context: Context,
    private val assetFolder: String,
    private val fileExtension: String
) : AmbienceProvider {

    override fun send(ambience: Ambience) {
        val assetPath = "$assetFolder/${ambience.name.value}.$fileExtension"
        val fileDescriptor = context.assets.openFd(assetPath)
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