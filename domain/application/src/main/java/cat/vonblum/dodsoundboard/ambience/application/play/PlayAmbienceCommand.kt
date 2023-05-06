package cat.vonblum.dodsoundboard.ambience.application.play

import cat.vonblum.dodsoundboard.shared.domain.bus.command.Command

class PlayAmbienceCommand(val ambienceName: String) : Command