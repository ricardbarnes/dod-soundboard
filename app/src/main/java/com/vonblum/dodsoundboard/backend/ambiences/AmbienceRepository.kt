package com.vonblum.dodsoundboard.backend.ambiences

interface AmbienceRepository {
    fun findAll(): List<Ambience>
}