package cat.vonblum.dodsoundboard.ambience.ui

import android.view.View
import cat.vonblum.dodsoundboard.ambience.application.play.AmbiencePlayerCommand
import cat.vonblum.dodsoundboard.ambience.application.play.AmbiencePlayerCommandHandler

class AmbienceTouchListener(
    private val ambienceName: String,
    private val ambiencePlayerCommandHandler: AmbiencePlayerCommandHandler
) :
    View.OnClickListener {

    override fun onClick(p0: View?) {
        val ambiencePlayerCommand = AmbiencePlayerCommand(ambienceName)
        ambiencePlayerCommandHandler.handle(ambiencePlayerCommand)
    }

}