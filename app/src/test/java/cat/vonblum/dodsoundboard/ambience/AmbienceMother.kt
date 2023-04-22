package cat.vonblum.dodsoundboard.ambience

import cat.vonblum.dodsoundboard.ambiences.model.Ambience
import cat.vonblum.dodsoundboard.ambiences.model.AmbienceName

class AmbienceMother {

    companion object {
        fun create(
            id: AmbienceId?,
            uri: AmbienceName?
        ): Ambience {
            return Ambience(
                id ?: AmbienceIdMother.create(null),
                uri ?: AmbienceUriMother.create(null)
            )
        }
    }

}