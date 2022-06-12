package com.vonblum.dodsoundboard.backend.intros.service

import com.vonblum.dodsoundboard.backend.intros.Intro
import com.vonblum.dodsoundboard.backend.intros.IntroRepository

class IntroLoaderService(private val introRepository: IntroRepository) {
    fun load(): List<Intro> {
        return introRepository.findAll()
    }
}