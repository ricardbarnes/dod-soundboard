package com.vonblum.dodsounds.outros.repository

import com.vonblum.dodsounds.outros.Outro
import com.vonblum.dodsounds.outros.OutroId
import java.util.*

interface OutroRepository {

    fun findById(id: OutroId): Optional<Outro>

    fun find(filter: OutroFilter): Optional<List<Outro>>

    fun save(outro: Outro)

    fun delete(outro: Outro)

}