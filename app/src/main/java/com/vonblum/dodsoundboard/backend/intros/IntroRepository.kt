package com.vonblum.dodsoundboard.backend.intros

interface IntroRepository {
    fun findAll(): List<Intro>
}