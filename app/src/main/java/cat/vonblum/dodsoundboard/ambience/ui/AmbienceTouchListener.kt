package cat.vonblum.dodsoundboard.ambience.ui

import android.view.View
import cat.vonblum.dodsoundboard.ambience.application.play.PlayAmbienceCommand
import cat.vonblum.dodsoundboard.ambience.application.play.PlayAmbienceCommandHandler

class AmbienceTouchListener(
    private val ambienceName: String,
    private val playAmbienceCommandHandler: PlayAmbienceCommandHandler
) :
    View.OnClickListener {

    override fun onClick(p0: View?) {
        val playAmbienceCommand = PlayAmbienceCommand(ambienceName)
        playAmbienceCommandHandler.handle(playAmbienceCommand)
    }

}