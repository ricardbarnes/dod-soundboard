package com.vonblum.dodsoundboard.weapons

interface WeaponsRepository {
    fun findAll(): List<Weapon>
}