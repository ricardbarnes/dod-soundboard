package cat.vonblum.dodsoundboard.ambience

import cat.vonblum.dodsoundboard.domain.model.AmbienceName

class AmbienceUriMother {

    companion object {
        private const val MIN_LENGTH = 1
        private const val MAX_LENGTH = 16
        private const val EXTENSION = ".wav"
        private val ALLOWED_CHARS = ('A'..'Z') + ('a'..'z') + ('0'..'9')

        private fun createRandom(): String {
            val length = (MIN_LENGTH..MAX_LENGTH).random()
            val filename = (1..length)
                .map { ALLOWED_CHARS.random() }
                .joinToString("")
            return filename + EXTENSION
        }

        fun create(uri: String?): AmbienceName {
            return AmbienceName(uri ?: createRandom())
        }
    }

}