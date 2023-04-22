package cat.vonblum.dodsoundboard.ambience.infrastructure.ui

import android.content.Context
import android.view.View
import cat.vonblum.dodsoundboard.domain.application.play.AmbiencePlayer
import cat.vonblum.dodsoundboard.domain.model.Ambience

class AmbienceTouchListener(
    private val context: Context,
    private val ambience: Ambience,
    private val ambiencePlayer: AmbiencePlayer
) :
    View.OnClickListener {
    override fun onClick(p0: View?) {
        ambiencePlayer.execute(ambience)
    }
}