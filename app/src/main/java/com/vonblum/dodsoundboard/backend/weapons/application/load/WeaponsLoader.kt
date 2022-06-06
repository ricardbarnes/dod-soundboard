package com.vonblum.dodsoundboard.backend.weapons.application.load

import com.vonblum.dodsoundboard.backend.weapons.Weapon
import com.vonblum.dodsoundboard.backend.weapons.WeaponsRepository

class WeaponsLoader(private val repository: WeaponsRepository) {
    fun run(): List<Weapon> {
        return repository.findAll()
    }
}