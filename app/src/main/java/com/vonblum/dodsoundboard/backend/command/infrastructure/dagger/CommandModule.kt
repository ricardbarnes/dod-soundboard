package com.vonblum.dodsoundboard.backend.command.infrastructure.dagger

import com.vonblum.dodsoundboard.backend.command.CommandService
import com.vonblum.dodsoundboard.backend.command.infrastructure.service.CommandServiceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class CommandModule {
    @Binds
    abstract fun bindCommandService(commandServiceImpl: CommandServiceImpl): CommandService
}