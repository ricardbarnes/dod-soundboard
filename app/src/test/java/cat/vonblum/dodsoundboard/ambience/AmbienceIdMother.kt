package cat.vonblum.dodsoundboard.ambience

import com.vonblum.dodsoundboard.shared.valueobject.Id
import java.util.UUID

class AmbienceIdMother {

    companion object {
        fun create(id: UUID?): AmbienceId {
            return AmbienceId(id?.let { Id(it) } ?: Id(UUID.randomUUID()))
        }
    }

}