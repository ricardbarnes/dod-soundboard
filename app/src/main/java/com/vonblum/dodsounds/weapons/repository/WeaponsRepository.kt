package com.vonblum.dodsounds.weapons.repository

import com.vonblum.dodsounds.weapons.Weapon
import com.vonblum.dodsounds.weapons.WeaponId
import java.util.*

interface WeaponsRepository {

    fun findById(id: WeaponId): Optional<Weapon>

    fun find(filter: WeaponsFilter): Optional<List<Weapon>>

    fun save(weapon: Weapon)

    fun delete(weapon: Weapon)

}