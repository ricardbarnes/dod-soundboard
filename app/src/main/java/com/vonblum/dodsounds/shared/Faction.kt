package com.vonblum.dodsounds.shared

open class Faction(val faction: FactionEnum) {
    enum class FactionEnum {
        GERMAN,
        US,
        BRITISH
    }
}