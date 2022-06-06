package com.vonblum.dodsoundboard.voices

interface VoiceRepository {
    fun findAll(): List<Voice>
}