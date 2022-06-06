package com.vonblum.dodsounds.outros

import com.vonblum.dodsounds.shared.Entity

data class Outro(
    val filename: OutroFilename,
    val faction: OutroFaction
) : Entity()