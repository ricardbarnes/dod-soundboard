package cat.vonblum.dodsoundboard.ambience.provider

import android.content.Context
import android.media.MediaPlayer
import cat.vonblum.dodsoundboard.ambience.model.Ambience
import cat.vonblum.dodsoundboard.ambience.ports.AmbienceProvider
import com.vonblum.dodsoundboard.R

class AmbienceAndroidProvider(private val context: Context) :
    AmbienceProvider {

    override fun send(ambience: Ambience) {
        val mediaPlayer = MediaPlayer()

        val assetPath =
            "${context.resources.getString(R.string.ambience_asset_folder)}${
                context.resources.getString(
                    R.string.system_path_separator
                )
            }${ambience.name.value}${
                context.resources.getString(R.string.file_extension_delimiter)
            }${context.resources.getString(R.string.sound_file_extension)}"
        val fileDescriptor = context.assets.openFd(assetPath)

        mediaPlayer.setDataSource(
            fileDescriptor.fileDescriptor,
            fileDescriptor.startOffset,
            fileDescriptor.length
        )
        mediaPlayer.prepare()
        mediaPlayer.start()
    }
}
