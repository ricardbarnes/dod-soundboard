package com.vonblum.dodsoundboard.weapons.application.load

import com.vonblum.dodsoundboard.weapons.Weapon
import com.vonblum.dodsoundboard.weapons.WeaponsRepository

class WeaponsLoader(private val repository: WeaponsRepository) {
    fun run(): List<Weapon> {
        return repository.findAll()
    }
}