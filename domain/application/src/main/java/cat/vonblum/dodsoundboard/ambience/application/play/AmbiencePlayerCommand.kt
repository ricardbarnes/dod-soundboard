package cat.vonblum.dodsoundboard.ambience.application.play

import cat.vonblum.dodsoundboard.ambience.model.AmbienceName
import cat.vonblum.dodsoundboard.shared.domain.bus.command.Command

class AmbiencePlayerCommand(val ambienceName: AmbienceName) : Command