package com.vonblum.dodsoundboard.backend.ambiences.domain

interface AmbienceRepository {
    fun findAll(): List<Ambience>
}