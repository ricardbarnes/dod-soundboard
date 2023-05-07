package cat.vonblum.dodsoundboard.ambience.config;

import android.content.Context;
import android.media.MediaPlayer;
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
    "rawtypes"
})
public final class AmbienceModule_ProvideAmbienceProviderFactory implements Factory<AmbienceProvider> {
  private final AmbienceModule module;

  private final Provider<Context> contextProvider;

  private final Provider<MediaPlayer> mediaPlayerProvider;

  public AmbienceModule_ProvideAmbienceProviderFactory(AmbienceModule module,
      Provider<Context> contextProvider, Provider<MediaPlayer> mediaPlayerProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
    this.mediaPlayerProvider = mediaPlayerProvider;
  }

  @Override
  public AmbienceProvider get() {
    return provideAmbienceProvider(module, contextProvider.get(), mediaPlayerProvider.get());
  }

  public static AmbienceModule_ProvideAmbienceProviderFactory create(AmbienceModule module,
      Provider<Context> contextProvider, Provider<MediaPlayer> mediaPlayerProvider) {
    return new AmbienceModule_ProvideAmbienceProviderFactory(module, contextProvider, mediaPlayerProvider);
  }

  public static AmbienceProvider provideAmbienceProvider(AmbienceModule instance, Context context,
      MediaPlayer mediaPlayer) {
    return Preconditions.checkNotNullFromProvides(instance.provideAmbienceProvider(context, mediaPlayer));
  }
}
