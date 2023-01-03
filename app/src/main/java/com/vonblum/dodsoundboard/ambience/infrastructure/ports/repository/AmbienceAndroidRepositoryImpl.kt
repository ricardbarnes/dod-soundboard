package com.vonblum.dodsoundboard.ambience.infrastructure.ports.repository

import android.content.res.AssetManager
import com.vonblum.dodsoundboard.ambience.domain.model.Ambience
import com.vonblum.dodsoundboard.ambience.domain.ports.AmbienceRepository
import java.util.Optional

class AmbienceAndroidRepositoryImpl(
    private val assetManager: AssetManager,
    private val assetBasePath: String
) :
    AmbienceRepository {

    override fun findAll(): Optional<List<Ambience>> {
        val ambiences = assetManager.list(assetBasePath)

        for (ambience: String in ambiences!!) {
            // TODO
        }

        return // TODO
    }
}