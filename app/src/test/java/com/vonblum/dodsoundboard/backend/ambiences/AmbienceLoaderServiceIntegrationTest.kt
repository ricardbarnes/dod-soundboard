package com.vonblum.dodsoundboard.backend.ambiences

import com.vonblum.dodsoundboard.backend.ambiences.service.AmbienceLoaderService
import org.junit.Assert
import org.junit.Test

class AmbienceLoaderServiceIntegrationTest {

    lateinit var ambienceLoaderService: AmbienceLoaderService

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
        ambienceLoaderService = AmbienceLoaderService(ambienceInMemoryRepository)

        // When
        val loadedAmbiences = ambienceLoaderService.load()

        // Then
        Assert.assertEquals(totalAmbiences, loadedAmbiences.size)
        for (i in 0 until totalAmbiences) {
            Assert.assertEquals(ambiences[i], loadedAmbiences[i])
        }
    }
}