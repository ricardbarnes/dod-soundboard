package cat.vonblum.dodsoundboard.ambience.module;

import android.content.Context;
import cat.vonblum.dodsoundboard.ambience.ports.AmbienceRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AmbienceModule_ProvideAmbienceRepositoryFactory implements Factory<AmbienceRepository> {
  private final AmbienceModule module;

  private final Provider<Context> contextProvider;

  public AmbienceModule_ProvideAmbienceRepositoryFactory(AmbienceModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public AmbienceRepository get() {
    return provideAmbienceRepository(module, contextProvider.get());
  }

  public static AmbienceModule_ProvideAmbienceRepositoryFactory create(AmbienceModule module,
      Provider<Context> contextProvider) {
    return new AmbienceModule_ProvideAmbienceRepositoryFactory(module, contextProvider);
  }

  public static AmbienceRepository provideAmbienceRepository(AmbienceModule instance,
      Context context) {
    return Preconditions.checkNotNullFromProvides(instance.provideAmbienceRepository(context));
  }
}
