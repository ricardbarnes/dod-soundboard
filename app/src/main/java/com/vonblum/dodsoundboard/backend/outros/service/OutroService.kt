package com.vonblum.dodsoundboard.backend.outros.service

import com.vonblum.dodsoundboard.backend.outros.Outro
import com.vonblum.dodsoundboard.backend.outros.OutroRepository

class OutroService(private val outroRepository: OutroRepository) {
    fun load(): List<Outro> {
        return outroRepository.findAll()
    }
}