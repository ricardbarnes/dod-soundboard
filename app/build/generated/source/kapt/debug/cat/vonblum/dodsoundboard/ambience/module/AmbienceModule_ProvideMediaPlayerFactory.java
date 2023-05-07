package cat.vonblum.dodsoundboard.ambience.module;

import android.media.MediaPlayer;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class AmbienceModule_ProvideMediaPlayerFactory implements Factory<MediaPlayer> {
  private final AmbienceModule module;

  public AmbienceModule_ProvideMediaPlayerFactory(AmbienceModule module) {
    this.module = module;
  }

  @Override
  public MediaPlayer get() {
    return provideMediaPlayer(module);
  }

  public static AmbienceModule_ProvideMediaPlayerFactory create(AmbienceModule module) {
    return new AmbienceModule_ProvideMediaPlayerFactory(module);
  }

  public static MediaPlayer provideMediaPlayer(AmbienceModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideMediaPlayer());
  }
}
