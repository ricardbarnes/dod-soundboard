package com.vonblum.dodsounds.outros.repository

import com.vonblum.dodsounds.outros.OutroFaction
import com.vonblum.dodsounds.shared.repository.RepositoryConfig

class OutroFilter(
    val limit: Int = RepositoryConfig.DEFAULT_LIMIT,
    val faction: OutroFaction?
)