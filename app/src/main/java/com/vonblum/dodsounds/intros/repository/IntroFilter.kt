package com.vonblum.dodsounds.intros.repository

import com.vonblum.dodsounds.intros.IntroFaction
import com.vonblum.dodsounds.shared.repository.RepositoryConfig

class IntroFilter(
    val limit: Int = RepositoryConfig.DEFAULT_LIMIT,
    val faction: IntroFaction?
)