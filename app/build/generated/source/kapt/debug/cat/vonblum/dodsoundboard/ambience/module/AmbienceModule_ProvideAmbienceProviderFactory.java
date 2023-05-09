package cat.vonblum.dodsoundboard.ambience.module;

import android.content.Context;
import cat.vonblum.dodsoundboard.ambience.ports.AmbienceProvider;
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
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class AmbienceModule_ProvideAmbienceProviderFactory implements Factory<AmbienceProvider> {
  private final AmbienceModule module;

  private final Provider<Context> contextProvider;

  public AmbienceModule_ProvideAmbienceProviderFactory(AmbienceModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public AmbienceProvider get() {
    return provideAmbienceProvider(module, contextProvider.get());
  }

  public static AmbienceModule_ProvideAmbienceProviderFactory create(AmbienceModule module,
      Provider<Context> contextProvider) {
    return new AmbienceModule_ProvideAmbienceProviderFactory(module, contextProvider);
  }

  public static AmbienceProvider provideAmbienceProvider(AmbienceModule instance, Context context) {
    return Preconditions.checkNotNullFromProvides(instance.provideAmbienceProvider(context));
  }
}
