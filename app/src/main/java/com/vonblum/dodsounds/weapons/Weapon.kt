package com.vonblum.dodsounds.weapons

import android.content.Context
import com.vonblum.dodsounds.shared.Entity
import com.vonblum.dodsounds.shared.Playable
import com.vonblum.dodsounds.shared.soundplayer.SoundPlayer

data class Weapon(
    val soundPlayer: SoundPlayer,
    val filename: WeaponFilename
) : Entity(), Playable {
    override fun play(context: Context) {
        soundPlayer.play(context, filename.value)
    }
}