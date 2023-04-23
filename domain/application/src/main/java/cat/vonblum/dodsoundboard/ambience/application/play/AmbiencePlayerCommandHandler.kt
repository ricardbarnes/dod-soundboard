package cat.vonblum.dodsoundboard.ambience.application.play

import cat.vonblum.dodsoundboard.ambience.model.AmbienceName
import cat.vonblum.dodsoundboard.shared.domain.bus.command.CommandHandler

class AmbiencePlayerCommandHandler(private val ambiencePlayer: AmbiencePlayer) : CommandHandler {

    fun handleSynchronously(ambiencePlayerCommand: AmbiencePlayerCommand) {
        ambiencePlayer.execute(AmbienceName(ambiencePlayerCommand.ambienceName))
    }

}