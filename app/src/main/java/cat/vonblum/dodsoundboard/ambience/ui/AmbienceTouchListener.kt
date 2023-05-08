package cat.vonblum.dodsoundboard.ambience.ui

import android.view.View
import cat.vonblum.dodsoundboard.ambience.application.play.PlayAmbienceCommand
import cat.vonblum.dodsoundboard.shared.domain.bus.command.CommandBus

class AmbienceTouchListener(
    private val ambienceName: String,
    private val commandBus: CommandBus,
) :
    View.OnClickListener {

    override fun onClick(p0: View?) {
        val playAmbienceCommand = PlayAmbienceCommand(ambienceName)
        commandBus.dispatch(playAmbienceCommand)
    }

}