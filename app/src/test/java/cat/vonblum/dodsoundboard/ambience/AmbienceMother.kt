package cat.vonblum.dodsoundboard.ambience

import cat.vonblum.dodsoundboard.domain.model.Ambience
import cat.vonblum.dodsoundboard.domain.core.model.AmbienceName

class AmbienceMother {

    companion object {
        fun create(
            id: AmbienceId?,
            uri: cat.vonblum.dodsoundboard.domain.core.model.AmbienceName?
        ): Ambience {
            return Ambience(
                id ?: AmbienceIdMother.create(null),
                uri ?: AmbienceUriMother.create(null)
            )
        }
    }

}