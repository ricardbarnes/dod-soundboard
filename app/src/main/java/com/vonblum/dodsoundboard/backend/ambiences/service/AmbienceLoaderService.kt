package com.vonblum.dodsoundboard.backend.ambiences.service

import com.vonblum.dodsoundboard.backend.ambiences.Ambience
import com.vonblum.dodsoundboard.backend.ambiences.AmbienceRepository

class AmbienceLoaderService(private val ambienceRepository: AmbienceRepository) {
    fun load(): List<Ambience> {
        return ambienceRepository.findAll()
    }
}