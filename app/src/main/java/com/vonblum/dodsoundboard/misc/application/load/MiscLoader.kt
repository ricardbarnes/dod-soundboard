package com.vonblum.dodsoundboard.misc.application.load

import com.vonblum.dodsoundboard.misc.Misc
import com.vonblum.dodsoundboard.misc.MiscRepository

class MiscLoader(private val repository: MiscRepository) {
    fun run(): List<Misc> {
        return repository.findAll()
    }
}