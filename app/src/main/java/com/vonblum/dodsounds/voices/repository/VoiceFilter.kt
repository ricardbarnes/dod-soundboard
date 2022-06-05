package com.vonblum.dodsounds.voices.repository

import com.vonblum.dodsounds.shared.repository.RepositoryConfig
import com.vonblum.dodsounds.voices.VoiceFaction

class VoiceFilter(
    val limit: Int = RepositoryConfig.DEFAULT_LIMIT,
    val faction: VoiceFaction
)