package cat.vonblum.dodsoundboard.ambiences.model

data class Ambience(val name: AmbienceName) {

    companion object {
        fun create(name: AmbienceName): Ambience {
            return Ambience(name)
        }
    }

}
