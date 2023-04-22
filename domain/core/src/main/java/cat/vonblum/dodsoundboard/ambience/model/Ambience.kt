package cat.vonblum.dodsoundboard.ambience.model

data class Ambience(val name: AmbienceName) {

    companion object {
        fun create(name: AmbienceName): Ambience {
            return Ambience(name)
        }
    }

}
