package cat.vonblum.dodsoundboard.ambience.config;

import cat.vonblum.dodsoundboard.ambience.application.play.PlayAmbienceCommandHandler;
import cat.vonblum.dodsoundboard.ambience.ports.AmbienceProvider;
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
    "rawtypes"
})
public final class AmbienceModule_ProvidePlayAmbienceCommandHandlerFactory implements Factory<PlayAmbienceCommandHandler> {
  private final AmbienceModule module;

  private final Provider<AmbienceProvider> ambienceProvider;

  public AmbienceModule_ProvidePlayAmbienceCommandHandlerFactory(AmbienceModule module,
      Provider<AmbienceProvider> ambienceProvider) {
    this.module = module;
    this.ambienceProvider = ambienceProvider;
  }

  @Override
  public PlayAmbienceCommandHandler get() {
    return providePlayAmbienceCommandHandler(module, ambienceProvider.get());
  }

  public static AmbienceModule_ProvidePlayAmbienceCommandHandlerFactory create(
      AmbienceModule module, Provider<AmbienceProvider> ambienceProvider) {
    return new AmbienceModule_ProvidePlayAmbienceCommandHandlerFactory(module, ambienceProvider);
  }

  public static PlayAmbienceCommandHandler providePlayAmbienceCommandHandler(
      AmbienceModule instance, AmbienceProvider ambienceProvider) {
    return Preconditions.checkNotNullFromProvides(instance.providePlayAmbienceCommandHandler(ambienceProvider));
  }
}
