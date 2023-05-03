package cat.vonblum.dodsoundboard.ambience.config;

import cat.vonblum.dodsoundboard.ambience.application.play.AmbiencePlayerCommandHandler;
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
public final class AmbienceModule_ProvideAmbiencePlayerCommandHandlerFactory implements Factory<AmbiencePlayerCommandHandler> {
  private final AmbienceModule module;

  private final Provider<AmbienceProvider> ambienceProvider;

  public AmbienceModule_ProvideAmbiencePlayerCommandHandlerFactory(AmbienceModule module,
      Provider<AmbienceProvider> ambienceProvider) {
    this.module = module;
    this.ambienceProvider = ambienceProvider;
  }

  @Override
  public AmbiencePlayerCommandHandler get() {
    return provideAmbiencePlayerCommandHandler(module, ambienceProvider.get());
  }

  public static AmbienceModule_ProvideAmbiencePlayerCommandHandlerFactory create(
      AmbienceModule module, Provider<AmbienceProvider> ambienceProvider) {
    return new AmbienceModule_ProvideAmbiencePlayerCommandHandlerFactory(module, ambienceProvider);
  }

  public static AmbiencePlayerCommandHandler provideAmbiencePlayerCommandHandler(
      AmbienceModule instance, AmbienceProvider ambienceProvider) {
    return Preconditions.checkNotNullFromProvides(instance.provideAmbiencePlayerCommandHandler(ambienceProvider));
  }
}
