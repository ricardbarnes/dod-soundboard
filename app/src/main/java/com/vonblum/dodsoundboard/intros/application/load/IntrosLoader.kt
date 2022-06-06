package com.vonblum.dodsoundboard.intros.application.load

import com.vonblum.dodsoundboard.intros.Intro
import com.vonblum.dodsoundboard.intros.IntroRepository

class IntrosLoader(private val repository: IntroRepository) {
    fun run(): List<Intro> {
        return repository.findAll()
    }
}