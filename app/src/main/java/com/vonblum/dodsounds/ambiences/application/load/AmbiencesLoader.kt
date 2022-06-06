package com.vonblum.dodsounds.ambiences.application.load

import com.vonblum.dodsounds.ambiences.Ambience
import com.vonblum.dodsounds.ambiences.AmbienceRepository

class AmbiencesLoader(private val repository: AmbienceRepository) {
    fun run(): List<Ambience> {
        return repository.findAll()
    }
}