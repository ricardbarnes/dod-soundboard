package cat.vonblum.dodsoundboard.ambience

import cat.vonblum.dodsoundboard.ambience.model.Ambience
import cat.vonblum.dodsoundboard.ambience.ports.AmbienceRepository
import org.junit.Assert
import org.junit.Test

class AmbiencesFinderTest {

    lateinit var ambienceLoaderService: cat.vonblum.dodsoundboard.ambience.application.find.AmbiencesFinder

    @Test
    fun `it should load all ambiences`() {
        // Given
        val totalAmbiences = 100
        val ambiences = mutableListOf<Ambience>()

        for (i in 0 until totalAmbiences) {
            ambiences.add(AmbienceMother.create(null, null))
        }

        val ambienceInMemoryRepository = object : AmbienceRepository {
            override fun findAll(): List<Ambience> {
                return ambiences
            }
        }
        ambienceLoaderService = cat.vonblum.dodsoundboard.ambience.application.find.AmbiencesFinder(
            ambienceInMemoryRepository
        )

        // When
        val loadedAmbiences = ambienceLoaderService.execute()

        // Then
        Assert.assertEquals(ambiences, loadedAmbiences)
    }
}