package com.vonblum.dodsoundboard.backend.ambiences.domain

import com.vonblum.dodsoundboard.backend.shared.Aggregate

data class Ambience(private val filename: AmbienceFilename) : Aggregate() {

    fun filename(): AmbienceFilename {
        return filename
    }

}