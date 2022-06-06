package com.vonblum.dodsounds.voices

interface VoiceRepository {

    fun findAll(): List<Voice>

}