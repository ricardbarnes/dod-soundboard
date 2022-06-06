package com.vonblum.dodsoundboard.backend.voices.application.load

import com.vonblum.dodsoundboard.backend.voices.Voice
import com.vonblum.dodsoundboard.backend.voices.VoiceRepository

class VoicesLoader(private val repository: VoiceRepository) {
    fun run(): List<Voice> {
        return repository.findAll()
    }
}