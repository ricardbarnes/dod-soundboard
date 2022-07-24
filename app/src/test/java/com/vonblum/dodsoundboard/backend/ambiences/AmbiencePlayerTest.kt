package com.vonblum.dodsoundboard.backend.ambiences

import android.content.Context
import com.vonblum.dodsoundboard.backend.ambiences.application.play.AmbiencePlayer
import com.vonblum.dodsoundboard.backend.shared.soundplayer.SoundPlayer
import org.junit.Test

class AmbiencePlayerTest { // TODO

    lateinit var soundPlayerMock: SoundPlayer

    lateinit var contextMock: Context

    lateinit var ambiencePlayer: AmbiencePlayer

    @Test
    fun `it should play an ambience`() {
        // Given
        ambiencePlayer = AmbiencePlayer(soundPlayerMock, contextMock)
        val ambience = AmbienceMother.create(null)

        // When
        ambiencePlayer.main(ambience)

        // Then
    }
}