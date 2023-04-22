package cat.vonblum.dodsoundboard.ambience.infrastructure.ports

import android.content.res.AssetManager
import cat.vonblum.dodsoundboard.ambience.domain.model.Ambience
import cat.vonblum.dodsoundboard.ambience.domain.ports.AmbienceRepository
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