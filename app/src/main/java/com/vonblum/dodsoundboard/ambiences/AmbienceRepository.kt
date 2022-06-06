package com.vonblum.dodsoundboard.ambiences

interface AmbienceRepository {
    fun findAll(): List<Ambience>
}