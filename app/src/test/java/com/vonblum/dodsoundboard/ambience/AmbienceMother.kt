package com.vonblum.dodsoundboard.ambience

import com.vonblum.dodsoundboard.ambience.domain.model.Ambience
import com.vonblum.dodsoundboard.ambience.domain.model.AmbienceName

class AmbienceMother {

    companion object {
        fun create(
            id: AmbienceId?,
            uri: AmbienceName?
        ): Ambience {
            return Ambience(
                id ?: AmbienceIdMother.create(null),
                uri ?: AmbienceUriMother.create(null)
            )
        }
    }

}