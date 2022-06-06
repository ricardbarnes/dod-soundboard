package com.vonblum.dodsounds.intros

import com.vonblum.dodsounds.shared.Entity

data class Intro(
    val id: IntroId,
    val filename: IntroFilename,
    val faction: IntroFaction
) : Entity()