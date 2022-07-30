package com.vonblum.dodsoundboard.backend.ambiences

import com.vonblum.dodsoundboard.backend.ambiences.domain.Ambience
import com.vonblum.dodsoundboard.backend.ambiences.domain.AmbienceRepository
import com.vonblum.dodsoundboard.backend.ambiences.application.load.AmbiencesLoader
import org.junit.Assert
import org.junit.Test

class AmbiencesLoaderTest {

    lateinit var ambienceLoaderService: AmbiencesLoader

    @Test
    fun `it should load all ambiences`() {
        // Given
        val totalAmbiences = 100
        val ambiences = mutableListOf<Ambience>()

        for (i in 0 until totalAmbiences) {
            ambiences.add(AmbienceMother.create(null))
        }

        val ambienceInMemoryRepository = object : AmbienceRepository {
            override fun findAll(): List<Ambience> {
                return ambiences
            }
        }
        ambienceLoaderService = AmbiencesLoader(ambienceInMemoryRepository)

        // When
        val loadedAmbiences = ambienceLoaderService.main()

        // Then
        Assert.assertEquals(ambiences, loadedAmbiences)
    }
}