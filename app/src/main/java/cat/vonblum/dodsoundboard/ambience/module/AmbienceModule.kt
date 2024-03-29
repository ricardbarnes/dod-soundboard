package cat.vonblum.dodsoundboard.ambience.module

import android.content.Context
import cat.vonblum.dodsoundboard.ambience.application.find.FindAmbiencesQueryHandler
import cat.vonblum.dodsoundboard.ambience.application.play.PlayAmbienceCommandHandler
import cat.vonblum.dodsoundboard.ambience.ports.AmbienceProvider
import cat.vonblum.dodsoundboard.ambience.ports.AmbienceRepository
import cat.vonblum.dodsoundboard.ambience.provider.AmbienceAndroidProvider
import cat.vonblum.dodsoundboard.ambience.repository.AmbienceAndroidRepository
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
    fun provideFindAmbiencesQueryHandler(ambienceRepository: AmbienceRepository): FindAmbiencesQueryHandler =
        FindAmbiencesQueryHandler(ambienceRepository)

    @Singleton
    @Provides
    fun providePlayAmbienceCommandHandler(ambienceProvider: AmbienceProvider): PlayAmbienceCommandHandler =
        PlayAmbienceCommandHandler(ambienceProvider)

    @Singleton
    @Provides
    fun provideAmbienceRepository(@ApplicationContext context: Context): AmbienceRepository =
        AmbienceAndroidRepository(context)

    @Singleton
    @Provides
    fun provideAmbienceProvider(@ApplicationContext context: Context): AmbienceProvider =
        AmbienceAndroidProvider(context)

}