package com.vonblum.dodsoundboard.ambience.domain.application.find

import com.vonblum.dodsoundboard.ambience.domain.model.Ambience
import com.vonblum.dodsoundboard.ambience.domain.ports.AmbienceRepository

class AmbienceFinder(private val repository: AmbienceRepository) {

    fun execute(): List<Ambience> {
        return repository.findAll()
    }

}