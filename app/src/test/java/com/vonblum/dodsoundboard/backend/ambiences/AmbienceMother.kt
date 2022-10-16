package com.vonblum.dodsoundboard.backend.ambiences

import com.vonblum.dodsoundboard.backend.ambiences.domain.Ambience
import com.vonblum.dodsoundboard.backend.ambiences.domain.AmbienceId
import com.vonblum.dodsoundboard.backend.ambiences.domain.AmbienceUri

class AmbienceMother {

    companion object {
        fun create(
            id: AmbienceId?,
            uri: AmbienceUri?
        ): Ambience {
            return Ambience(
                id ?: AmbienceIdMother.create(null),
                uri ?: AmbienceUriMother.create(null)
            )
        }
    }

}