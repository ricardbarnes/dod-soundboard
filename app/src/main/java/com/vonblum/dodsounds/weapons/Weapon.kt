package com.vonblum.dodsounds.weapons

import com.vonblum.dodsounds.shared.Entity

data class Weapon(
    val id: WeaponId,
    val filename: WeaponFilename
) : Entity()