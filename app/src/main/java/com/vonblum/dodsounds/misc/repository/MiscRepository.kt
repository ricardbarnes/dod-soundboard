package com.vonblum.dodsounds.misc.repository

import com.vonblum.dodsounds.misc.Misc
import com.vonblum.dodsounds.misc.MiscId
import java.util.*

interface MiscRepository {

    fun findById(miscId: MiscId): Optional<Misc>

    fun find(filter: MiscFilter): Optional<List<Misc>>

    fun save(misc: Misc)

    fun delete(misc: Misc)

}