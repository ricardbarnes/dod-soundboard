package com.vonblum.dodsoundboard.intros

interface IntroRepository {
    fun findAll(): List<Intro>
}