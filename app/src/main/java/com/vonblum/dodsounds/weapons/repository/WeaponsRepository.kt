package com.vonblum.dodsounds.weapons.repository

import com.vonblum.dodsounds.weapons.Weapon
import java.util.*

interface WeaponsRepository {

    fun find(filter: WeaponsFilter): Optional<List<Weapon>>

    fun save(weapon: Weapon)

}