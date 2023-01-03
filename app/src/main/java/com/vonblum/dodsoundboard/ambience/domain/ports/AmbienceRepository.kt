package com.vonblum.dodsoundboard.ambience.domain.ports

import com.vonblum.dodsoundboard.ambience.domain.model.Ambience

interface AmbienceRepository {

    fun findAll(): List<Ambience>

}