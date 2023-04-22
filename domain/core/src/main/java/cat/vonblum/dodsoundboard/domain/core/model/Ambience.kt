package cat.vonblum.dodsoundboard.domain.core.model

data class Ambience(val name: AmbienceName) {

    companion object {
        fun create(name: AmbienceName): Ambience {
            return Ambience(name)
        }
    }

}
