package com.vonblum.dodsoundboard.backend.ambiences.infrastructure.repository

import com.vonblum.dodsoundboard.backend.ambiences.domain.Ambience
import com.vonblum.dodsoundboard.backend.ambiences.domain.AmbienceRepository

class AmbienceRepositoryImpl : AmbienceRepository {
    override fun findAll(): List<Ambience> {
        // TODO
        return listOf()
    }
}