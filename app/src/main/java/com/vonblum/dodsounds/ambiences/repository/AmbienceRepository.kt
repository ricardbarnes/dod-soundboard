package com.vonblum.dodsounds.ambiences.repository

import com.vonblum.dodsounds.ambiences.Ambience
import com.vonblum.dodsounds.ambiences.AmbienceId
import java.util.*

interface AmbienceRepository {

    fun findById(id: AmbienceId): Optional<Ambience>

    fun find(filter: AmbienceFilter): Optional<List<Ambience>>

    fun save(ambience: Ambience)

    fun delete(ambience: Ambience)

}