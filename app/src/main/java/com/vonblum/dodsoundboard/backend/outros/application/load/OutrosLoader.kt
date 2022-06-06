package com.vonblum.dodsoundboard.backend.outros.application.load

import com.vonblum.dodsoundboard.backend.outros.Outro
import com.vonblum.dodsoundboard.backend.outros.OutroRepository

class OutrosLoader(private val repository: OutroRepository) {
    fun run(): List<Outro> {
        return repository.findAll()
    }
}