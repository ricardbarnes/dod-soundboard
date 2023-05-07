package cat.vonblum.dodsoundboard.ambience.module;

import cat.vonblum.dodsoundboard.ambience.application.find.FindAmbiencesQueryHandler;
import cat.vonblum.dodsoundboard.ambience.ports.AmbienceRepository;
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
public final class AmbienceModule_ProvideFindAmbiencesQueryHandlerFactory implements Factory<FindAmbiencesQueryHandler> {
  private final AmbienceModule module;

  private final Provider<AmbienceRepository> ambienceRepositoryProvider;

  public AmbienceModule_ProvideFindAmbiencesQueryHandlerFactory(AmbienceModule module,
      Provider<AmbienceRepository> ambienceRepositoryProvider) {
    this.module = module;
    this.ambienceRepositoryProvider = ambienceRepositoryProvider;
  }

  @Override
  public FindAmbiencesQueryHandler get() {
    return provideFindAmbiencesQueryHandler(module, ambienceRepositoryProvider.get());
  }

  public static AmbienceModule_ProvideFindAmbiencesQueryHandlerFactory create(AmbienceModule module,
      Provider<AmbienceRepository> ambienceRepositoryProvider) {
    return new AmbienceModule_ProvideFindAmbiencesQueryHandlerFactory(module, ambienceRepositoryProvider);
  }

  public static FindAmbiencesQueryHandler provideFindAmbiencesQueryHandler(AmbienceModule instance,
      AmbienceRepository ambienceRepository) {
    return Preconditions.checkNotNullFromProvides(instance.provideFindAmbiencesQueryHandler(ambienceRepository));
  }
}
