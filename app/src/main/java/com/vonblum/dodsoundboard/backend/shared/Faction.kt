package com.vonblum.dodsoundboard.backend.shared

open class Faction(open val value: FactionEnum) {
    enum class FactionEnum {
        GERMAN,
        US,
        BRITISH
    }
}