package com.vonblum.dodsoundboard.ambiences.application.load

import com.vonblum.dodsoundboard.ambiences.Ambience
import com.vonblum.dodsoundboard.ambiences.AmbienceRepository

class AmbiencesLoader(private val repository: AmbienceRepository) {
    fun run(): List<Ambience> {
        return repository.findAll()
    }
}