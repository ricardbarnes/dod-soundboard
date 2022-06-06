package com.vonblum.dodsoundboard.backend.weapons

interface WeaponsRepository {
    fun findAll(): List<Weapon>
}