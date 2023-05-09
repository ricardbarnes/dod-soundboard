package cat.vonblum.dodsoundboard.shared.module;

import cat.vonblum.dodsoundboard.ambience.application.play.PlayAmbienceCommandHandler;
import cat.vonblum.dodsoundboard.shared.domain.bus.command.CommandBus;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class SharedModule_ProvideCommandBusFactory implements Factory<CommandBus> {
  private final SharedModule module;

  private final Provider<PlayAmbienceCommandHandler> playAmbienceCommandHandlerProvider;

  public SharedModule_ProvideCommandBusFactory(SharedModule module,
      Provider<PlayAmbienceCommandHandler> playAmbienceCommandHandlerProvider) {
    this.module = module;
    this.playAmbienceCommandHandlerProvider = playAmbienceCommandHandlerProvider;
  }

  @Override
  public CommandBus get() {
    return provideCommandBus(module, playAmbienceCommandHandlerProvider.get());
  }

  public static SharedModule_ProvideCommandBusFactory create(SharedModule module,
      Provider<PlayAmbienceCommandHandler> playAmbienceCommandHandlerProvider) {
    return new SharedModule_ProvideCommandBusFactory(module, playAmbienceCommandHandlerProvider);
  }

  public static CommandBus provideCommandBus(SharedModule instance,
      PlayAmbienceCommandHandler playAmbienceCommandHandler) {
    return Preconditions.checkNotNullFromProvides(instance.provideCommandBus(playAmbienceCommandHandler));
  }
}
