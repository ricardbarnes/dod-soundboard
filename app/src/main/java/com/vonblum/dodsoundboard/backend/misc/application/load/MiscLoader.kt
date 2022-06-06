package com.vonblum.dodsoundboard.backend.misc.application.load

import com.vonblum.dodsoundboard.backend.misc.Misc
import com.vonblum.dodsoundboard.backend.misc.MiscRepository

class MiscLoader(private val repository: MiscRepository) {
    fun run(): List<Misc> {
        return repository.findAll()
    }
}