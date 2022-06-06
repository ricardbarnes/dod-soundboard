package com.vonblum.dodsoundboard.shared

open class Faction(open val value: FactionEnum) {
    enum class FactionEnum {
        GERMAN,
        US,
        BRITISH
    }
}