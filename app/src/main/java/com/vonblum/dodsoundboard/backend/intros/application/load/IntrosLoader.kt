package com.vonblum.dodsoundboard.backend.intros.application.load

import com.vonblum.dodsoundboard.backend.intros.Intro
import com.vonblum.dodsoundboard.backend.intros.IntroRepository

class IntrosLoader(private val repository: IntroRepository) {
    fun run(): List<Intro> {
        return repository.findAll()
    }
}