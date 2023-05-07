package cat.vonblum.dodsoundboard.ambience.config

import android.content.Context
import android.media.MediaPlayer
import cat.vonblum.dodsoundboard.ambience.application.find.FindAmbiencesQueryHandler
import cat.vonblum.dodsoundboard.ambience.application.play.PlayAmbienceCommandHandler
import cat.vonblum.dodsoundboard.ambience.ports.AmbienceProvider
import cat.vonblum.dodsoundboard.ambience.ports.AmbienceRepository
import cat.vonblum.dodsoundboard.ambience.provider.AndroidAmbienceProvider
import cat.vonblum.dodsoundboard.ambience.repository.AndroidAmbienceRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AmbienceModule {

    @Singleton
    @Provides
    fun provideMediaPlayer(): MediaPlayer = MediaPlayer()

    @Singleton
    @Provides
    fun provideAmbienceRepository(@ApplicationContext context: Context): AmbienceRepository =
        AndroidAmbienceRepository(context)

    @Singleton
    @Provides
    fun provideAmbienceProvider(
        @ApplicationContext context: Context,
        mediaPlayer: MediaPlayer,
    ): AmbienceProvider =
        AndroidAmbienceProvider(context, mediaPlayer)

    @Singleton
    @Provides
    fun provideFindAmbiencesQueryHandler(ambienceRepository: AmbienceRepository): FindAmbiencesQueryHandler =
        FindAmbiencesQueryHandler(ambienceRepository)

    @Singleton
    @Provides
    fun providePlayAmbienceCommandHandler(ambienceProvider: AmbienceProvider): PlayAmbienceCommandHandler =
        PlayAmbienceCommandHandler(ambienceProvider)

}