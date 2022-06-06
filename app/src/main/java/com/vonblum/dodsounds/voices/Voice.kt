package com.vonblum.dodsounds.voices

import com.vonblum.dodsounds.shared.Entity

data class Voice(
    val id: VoiceId,
    val filename: VoiceFilename,
    val faction: VoiceFaction
) : Entity()