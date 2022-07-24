package com.vonblum.dodsoundboard.backend.ambiences.application.load

import com.vonblum.dodsoundboard.backend.ambiences.domain.Ambience
import com.vonblum.dodsoundboard.backend.ambiences.domain.AmbienceRepository

class AmbiencesLoader(private val ambienceRepository: AmbienceRepository) {
    fun main(): List<Ambience> {
        return ambienceRepository.findAll()
    }
}