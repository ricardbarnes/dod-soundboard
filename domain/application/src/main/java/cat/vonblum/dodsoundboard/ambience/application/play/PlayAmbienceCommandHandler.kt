package cat.vonblum.dodsoundboard.ambience.application.play

import cat.vonblum.dodsoundboard.ambience.model.Ambience
import cat.vonblum.dodsoundboard.ambience.model.AmbienceName
import cat.vonblum.dodsoundboard.ambience.ports.AmbienceProvider
import cat.vonblum.dodsoundboard.shared.domain.bus.command.CommandHandler

class PlayAmbienceCommandHandler(private val ambienceProvider: AmbienceProvider) :
    CommandHandler {

    fun handle(playAmbienceCommand: PlayAmbienceCommand) =
        ambienceProvider.send(
            Ambience(
                AmbienceName(playAmbienceCommand.ambienceName)
            )
        )

}