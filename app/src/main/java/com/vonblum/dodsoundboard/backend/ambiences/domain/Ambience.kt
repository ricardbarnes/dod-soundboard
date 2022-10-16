package com.vonblum.dodsoundboard.backend.ambiences.domain

import com.vonblum.dodsoundboard.backend.shared.Aggregate

data class Ambience(
    private val id: AmbienceId,
    private val uri: AmbienceUri
) : Aggregate() {

    fun uri(): AmbienceUri {
        return uri
    }
}