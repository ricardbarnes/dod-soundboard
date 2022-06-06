package com.vonblum.dodsounds.ambiences

import com.vonblum.dodsounds.shared.Entity

data class Ambience(
    val id: AmbienceId,
    val filename: AmbienceFilename
) : Entity()