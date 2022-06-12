package com.vonblum.dodsoundboard.backend.weapons.service

import com.vonblum.dodsoundboard.backend.weapons.Weapon
import com.vonblum.dodsoundboard.backend.weapons.WeaponsRepository

class WeaponLoaderService(private val weaponsRepository: WeaponsRepository) {
    fun load(): List<Weapon> {
        return weaponsRepository.findAll()
    }
}