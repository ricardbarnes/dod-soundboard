package com.vonblum.dodsounds.voices.repository

import com.vonblum.dodsounds.voices.Voice
import com.vonblum.dodsounds.voices.VoiceId
import java.util.*

interface VoiceRepository {

    fun findById(id: VoiceId): Optional<Voice>

    fun find(filter: VoiceFilter): Optional<List<Voice>>

    fun save(voice: Voice)

    fun delete(voice: Voice)

}