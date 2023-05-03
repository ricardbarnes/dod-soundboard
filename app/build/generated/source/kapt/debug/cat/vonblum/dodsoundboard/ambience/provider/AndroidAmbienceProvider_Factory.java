package cat.vonblum.dodsoundboard.ambience.provider;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class AndroidAmbienceProvider_Factory implements Factory<AndroidAmbienceProvider> {
  private final Provider<Context> contextProvider;

  public AndroidAmbienceProvider_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public AndroidAmbienceProvider get() {
    return newInstance(contextProvider.get());
  }

  public static AndroidAmbienceProvider_Factory create(Provider<Context> contextProvider) {
    return new AndroidAmbienceProvider_Factory(contextProvider);
  }

  public static AndroidAmbienceProvider newInstance(Context context) {
    return new AndroidAmbienceProvider(context);
  }
}
