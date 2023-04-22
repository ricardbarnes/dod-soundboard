package cat.vonblum.dodsoundboard.ambience.repository

import android.content.res.AssetManager
import cat.vonblum.dodsoundboard.domain.core.model.Ambience
import cat.vonblum.dodsoundboard.domain.core.ports.AmbienceRepository
import java.util.ArrayList

class AndroidAmbienceRepository(
    private val assetManager: AssetManager,
    private val assetBasePath: String
) :
    AmbienceRepository {

    override fun findAll(): List<Ambience> {
        val ambiences = assetManager.list(assetBasePath)

        for (ambience: String in ambiences!!) {
            // TODO
        }

        return ArrayList() // TODO
    }

}