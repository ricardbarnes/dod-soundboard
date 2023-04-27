package cat.vonblum.dodsoundboard.ambience.application.play

import cat.vonblum.dodsoundboard.ambience.model.Ambience
import cat.vonblum.dodsoundboard.ambience.model.AmbienceName
import cat.vonblum.dodsoundboard.ambience.ports.AmbienceProvider

class AmbiencePlayerCommandHandler(private val ambienceProvider: AmbienceProvider) {

    fun handle(ambiencePlayerCommand: AmbiencePlayerCommand) =
        ambienceProvider.send(
            Ambience(
                AmbienceName(ambiencePlayerCommand.ambienceName)
            )
        )

}