package com.vonblum.dodsounds.ambiences

import com.vonblum.dodsounds.ambiences.Ambience

interface AmbienceRepository {

    fun findAll(): List<Ambience>

}