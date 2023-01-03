package com.vonblum.dodsoundboard.ambience.domain.application.find

import com.vonblum.dodsoundboard.ambience.domain.exception.NoAmbiencesFoundException
import com.vonblum.dodsoundboard.ambience.domain.model.Ambience
import com.vonblum.dodsoundboard.ambience.domain.ports.AmbienceRepository

class AmbiencesFinder(private val repository: AmbienceRepository) {

    fun run(): List<Ambience> {
        val ambiences = repository.findAll()

        if (ambiences.isEmpty()) {
            throw NoAmbiencesFoundException()
        }

        return ambiences
    }

}