package cat.vonblum.dodsoundboard.shared.module

import cat.vonblum.dodsoundboard.ambience.application.find.FindAmbiencesQueryHandler
import cat.vonblum.dodsoundboard.ambience.application.play.PlayAmbienceCommandHandler
import cat.vonblum.dodsoundboard.shared.bus.command.InMemoryCommandBus
import cat.vonblum.dodsoundboard.shared.bus.query.InMemoryQueryBus
import cat.vonblum.dodsoundboard.shared.domain.bus.command.CommandBus
import cat.vonblum.dodsoundboard.shared.domain.bus.query.QueryBus
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class SharedModule {

    @Provides
    @Singleton
    fun provideQueryBus(findAmbiencesQueryHandler: FindAmbiencesQueryHandler): QueryBus =
        InMemoryQueryBus(listOf(findAmbiencesQueryHandler))

    @Provides
    @Singleton
    fun provideCommandBus(playAmbienceCommandHandler: PlayAmbienceCommandHandler): CommandBus =
        InMemoryCommandBus(listOf(playAmbienceCommandHandler))

}