package cat.vonblum.dodsoundboard.ambience.ui

import android.content.Context
import android.view.View
import cat.vonblum.dodsoundboard.ambiences.model.Ambience

class AmbienceTouchListener(
    private val context: Context,
    private val ambience: Ambience,
    private val ambiencePlayer: cat.vonblum.dodsoundboard.ambiences.application.play.AmbiencePlayer
) :
    View.OnClickListener {

    override fun onClick(p0: View?) {
        ambiencePlayer.execute(ambience)
    }

}