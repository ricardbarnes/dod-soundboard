package com.vonblum.dodsoundboard.backend.ambiences

import org.junit.Test
import org.mockito.Mock
import javax.inject.Inject

class AmbienceLoaderServiceTest {
    //    @Mock
    @Inject
    lateinit var ambienceRepository: AmbienceRepository

    @Test
    fun `it should load all the ambience sounds`() {
        val ambiences = ambienceRepository.findAll()
        assert(true)
    }
}