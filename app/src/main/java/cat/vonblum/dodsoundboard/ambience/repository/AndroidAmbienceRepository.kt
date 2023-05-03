package cat.vonblum.dodsoundboard.ambience.repository

import android.content.Context
import cat.vonblum.dodsoundboard.ambience.model.Ambience
import cat.vonblum.dodsoundboard.ambience.model.AmbienceName
import cat.vonblum.dodsoundboard.ambience.ports.AmbienceRepository
import com.vonblum.dodsoundboard.R
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AndroidAmbienceRepository @Inject constructor(private val context: Context) :
    AmbienceRepository {

    override fun findAll(limit: Int): List<Ambience> =
        context.assets.list(context.resources.getString(R.string.ambience_asset_folder))
            ?.map { it.substringBeforeLast(context.resources.getString(R.string.file_extension_delimiter)) }
            ?.map { AmbienceName(it) }
            ?.map { Ambience(it) } ?: ArrayList()

}