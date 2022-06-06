package com.vonblum.dodsoundboard.voices.application.load

import com.vonblum.dodsoundboard.voices.Voice
import com.vonblum.dodsoundboard.voices.VoiceRepository

class VoicesLoader(private val repository: VoiceRepository) {
    fun run(): List<Voice> {
        return repository.findAll()
    }
}