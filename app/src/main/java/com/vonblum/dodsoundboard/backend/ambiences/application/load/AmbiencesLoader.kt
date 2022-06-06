package com.vonblum.dodsoundboard.backend.ambiences.application.load

import com.vonblum.dodsoundboard.backend.ambiences.Ambience
import com.vonblum.dodsoundboard.backend.ambiences.AmbienceRepository

class AmbiencesLoader(private val repository: AmbienceRepository) {
    fun run(): List<Ambience> {
        return repository.findAll()
    }
}