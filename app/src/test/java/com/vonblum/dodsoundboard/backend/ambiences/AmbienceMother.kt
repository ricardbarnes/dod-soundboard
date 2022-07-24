package com.vonblum.dodsoundboard.backend.ambiences

class AmbienceMother {

    companion object {
        fun create(name: AmbienceFilename?): Ambience {
            return Ambience(name ?: AmbienceFilenameMother.create(null))
        }
    }

}