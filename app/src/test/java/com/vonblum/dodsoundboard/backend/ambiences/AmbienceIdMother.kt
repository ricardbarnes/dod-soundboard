package com.vonblum.dodsoundboard.backend.ambiences

import com.vonblum.dodsoundboard.backend.ambiences.domain.AmbienceId
import java.util.UUID

class AmbienceIdMother {

    companion object {
        fun create(id: UUID?): AmbienceId {
            return AmbienceId(id ?: UUID.randomUUID())
        }
    }

}