package com.vonblum.dodsoundboard.ui.ambiences

import android.content.Context
import android.view.View
import com.vonblum.dodsoundboard.backend.ambiences.domain.Ambience
import com.vonblum.dodsoundboard.backend.shared.soundplayer.SoundPlayer

class AmbienceTouchListener(
    private val context: Context,
    private val ambience: Ambience,
    private val soundPlayer: SoundPlayer
) :
    View.OnClickListener {
    override fun onClick(p0: View?) {
        soundPlayer.play(ambience.filename().value, context)
    }
}