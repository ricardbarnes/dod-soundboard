package com.vonblum.dodsoundboard.backend.ambiences

import android.content.Context
import com.vonblum.dodsoundboard.backend.ambiences.application.play.AmbiencePlayer
import com.vonblum.dodsoundboard.backend.shared.soundplayer.SoundPlayer
import org.junit.Test
import org.mockito.Mockito.mock

class AmbiencePlayerTest {

    /**
     * This test cannot check if an ambience is actually being played.
     * Please, use instrumented tests for that.
     */
    @Test
    fun `it should play an ambience`() {
        // Given
        val soundPlayer: SoundPlayer = mock(SoundPlayer::class.java)
        val context: Context = mock(Context::class.java)
        val ambiencePlayer = AmbiencePlayer(soundPlayer, context)
        val ambience = AmbienceMother.create(null, null)

        // When
        ambiencePlayer.main(ambience)

        // Then no exception is thrown
    }
}