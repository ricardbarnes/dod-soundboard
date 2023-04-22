package com.vonblum.dodsoundboard.ambience.domain.ports

import com.vonblum.dodsoundboard.ambience.domain.model.Ambience

interface AmbienceProvider {

    fun send(ambience: Ambience)

}