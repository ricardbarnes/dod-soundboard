package com.vonblum.dodsounds.ambiences

interface AmbienceRepository {
    fun findAll(): List<Ambience>
}