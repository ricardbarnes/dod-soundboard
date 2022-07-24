package com.vonblum.dodsoundboard.backend.ambiences

import com.vonblum.dodsoundboard.backend.ambiences.domain.Ambience
import com.vonblum.dodsoundboard.backend.ambiences.domain.AmbienceFilename

class AmbienceMother {

    companion object {
        fun create(name: AmbienceFilename?): Ambience {
            return Ambience(name ?: AmbienceFilenameMother.create(null))
        }
    }

}