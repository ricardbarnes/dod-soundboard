package cat.vonblum.dodsoundboard.ambience.repository

import android.content.res.AssetManager
import cat.vonblum.dodsoundboard.ambience.model.Ambience
import cat.vonblum.dodsoundboard.ambience.ports.AmbienceRepository

class AndroidAmbienceRepository(
    private val assetManager: AssetManager,
    private val assetFolder: String,
) : AmbienceRepository {

    override fun findAll(): List<Ambience> {
        val ambiences = assetManager.list(assetFolder)

        for (ambience: String in ambiences!!) {
            // TODO
        }

        return ArrayList() // TODO
    }

}