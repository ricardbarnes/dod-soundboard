package cat.vonblum.dodsoundboard.ambience.repository

import android.content.res.AssetManager
import cat.vonblum.dodsoundboard.ambience.model.Ambience
import cat.vonblum.dodsoundboard.ambience.model.AmbienceName
import cat.vonblum.dodsoundboard.ambience.ports.AmbienceRepository
import com.vonblum.dodsoundboard.shared.infrastructure.android.AndroidConfig

class AndroidAmbienceRepository(
    private val assetManager: AssetManager,
    private val assetFolder: String,
) : AmbienceRepository {

    override fun findAll(): List<Ambience> {
        return assetManager.list(assetFolder)
            ?.map { it.substringBeforeLast(AndroidConfig.FILE_EXTENSION_DELIMITER) }
            ?.map { AmbienceName(it) }
            ?.map { Ambience(it) } ?: ArrayList()
    }

}