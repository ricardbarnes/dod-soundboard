package com.vonblum.dodsoundboard.outros.application.load

import com.vonblum.dodsoundboard.outros.Outro
import com.vonblum.dodsoundboard.outros.OutroRepository

class OutrosLoader(private val repository: OutroRepository) {
    fun run(): List<Outro> {
        return repository.findAll()
    }
}