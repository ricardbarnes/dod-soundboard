package com.vonblum.dodsoundboard.ambience.infrastructure.ui.android

import android.content.Context
import android.view.View
import com.vonblum.dodsoundboard.ambience.domain.model.Ambience
import com.vonblum.dodsoundboard.ambience.domain.ports.AmbiencePlayer

class AmbienceTouchListener(
    private val context: Context,
    private val ambience: Ambience,
    private val soundPlayer: AmbiencePlayer
) :
    View.OnClickListener {
    override fun onClick(p0: View?) {
        soundPlayer.play(ambience.uri.value.path)
    }
}