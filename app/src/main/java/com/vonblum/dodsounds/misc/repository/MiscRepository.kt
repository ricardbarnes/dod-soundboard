package com.vonblum.dodsounds.misc.repository

import com.vonblum.dodsounds.misc.Misc
import java.util.*

interface MiscRepository {

    fun find(filter: MiscFilter): Optional<List<Misc>>

    fun save(misc: Misc)

}