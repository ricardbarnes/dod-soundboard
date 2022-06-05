package com.vonblum.dodsounds.voices.repository

import com.vonblum.dodsounds.voices.Voice
import java.util.*

interface VoiceRepository {

    fun find(filter: VoiceFilter): Optional<List<Voice>>

    fun save(voice: Voice)

}