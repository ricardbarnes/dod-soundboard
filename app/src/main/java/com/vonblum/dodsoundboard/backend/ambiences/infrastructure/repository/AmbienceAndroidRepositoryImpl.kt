package com.vonblum.dodsoundboard.backend.ambiences.infrastructure.repository

import android.content.res.AssetManager
import com.vonblum.dodsoundboard.backend.ambiences.domain.Ambience
import com.vonblum.dodsoundboard.backend.ambiences.domain.AmbienceRepository

class AmbienceAndroidRepositoryImpl(
    private val assetManager: AssetManager,
    private val assetBasePath: String
) :
    AmbienceRepository {

    override fun findAll(): List<Ambience> {
        val ambiences = assetManager.list(assetBasePath)

        for (ambience: String in ambiences!!) {
            // TODO
        }

        return listOf()
    }
}