package com.vonblum.dodsounds.outros.repository

import com.vonblum.dodsounds.outros.Outro
import java.util.*

interface OutroRepository {

    fun find(filter: OutroFilter): Optional<List<Outro>>

    fun save(outro: Outro)

}