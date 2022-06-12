package com.vonblum.dodsoundboard.backend.misc

class MiscLoaderService(private val miscRepository: MiscRepository) {
    fun load(): List<Misc> {
        return miscRepository.findAll()
    }
}