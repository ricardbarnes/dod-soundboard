package com.vonblum.dodsounds.intros.repository

import com.vonblum.dodsounds.intros.Intro
import java.util.*

interface IntroRepository {

    fun find(filter: IntroFilter): Optional<List<Intro>>

    fun save(intro: Intro)

}