package com.vonblum.dodsoundboard.weapons

import android.content.Context
import com.vonblum.dodsoundboard.shared.Entity
import com.vonblum.dodsoundboard.shared.Playable
import com.vonblum.dodsoundboard.shared.soundplayer.SoundPlayer

data class Weapon(
    private val soundPlayer: SoundPlayer,
    private val filename: WeaponFilename
) : Entity(), Playable {
    override fun play(context: Context) {
        soundPlayer.play(context, filename.value)
    }
}