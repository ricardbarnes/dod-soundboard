package com.vonblum.dodsounds.ambiences.repository

import com.vonblum.dodsounds.ambiences.Ambience
import java.util.*

interface AmbienceRepository {

    fun find(filter: AmbienceFilter): Optional<List<Ambience>>

    fun save(ambience: Ambience)

}