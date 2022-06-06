package com.vonblum.dodsounds.intros.repository

import com.vonblum.dodsounds.intros.Intro
import com.vonblum.dodsounds.intros.IntroId
import java.util.*

interface IntroRepository {

    fun findById(id: IntroId): Optional<Intro>

    fun find(filter: IntroFilter): Optional<List<Intro>>

    fun save(intro: Intro)

    fun delete(intro: Intro)

}