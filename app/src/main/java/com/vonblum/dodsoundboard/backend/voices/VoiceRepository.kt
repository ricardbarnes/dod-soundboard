package com.vonblum.dodsoundboard.backend.voices

interface VoiceRepository {
    fun findAll(): List<Voice>
}