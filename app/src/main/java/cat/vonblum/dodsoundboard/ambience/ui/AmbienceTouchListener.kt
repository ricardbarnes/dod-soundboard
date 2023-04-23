package cat.vonblum.dodsoundboard.ambience.ui

import android.view.View
import cat.vonblum.dodsoundboard.ambience.application.play.AmbiencePlayer
import cat.vonblum.dodsoundboard.ambience.model.Ambience

class AmbienceTouchListener(
    private val ambience: Ambience,
    private val ambiencePlayer: AmbiencePlayer
) :
    View.OnClickListener {

    override fun onClick(p0: View?) {
        ambiencePlayer.execute(ambience.name)
    }

}