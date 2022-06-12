package com.vonblum.dodsoundboard.backend.voices.service

import com.vonblum.dodsoundboard.backend.voices.Voice
import com.vonblum.dodsoundboard.backend.voices.VoiceRepository

class VoiceLoaderService(private val voiceRepository: VoiceRepository) {
    fun load(): List<Voice> {
        return voiceRepository.findAll()
    }
}