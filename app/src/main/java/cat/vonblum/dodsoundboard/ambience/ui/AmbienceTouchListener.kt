package cat.vonblum.dodsoundboard.ambience.ui

import android.content.Context
import android.view.View
import cat.vonblum.dodsoundboard.domain.core.model.Ambience

class AmbienceTouchListener(
    private val context: Context,
    private val ambience: Ambience,
    private val ambiencePlayer: cat.vonblum.dodsoundboard.domain.application.play.AmbiencePlayer
) :
    View.OnClickListener {

    override fun onClick(p0: View?) {
        ambiencePlayer.execute(ambience)
    }

}