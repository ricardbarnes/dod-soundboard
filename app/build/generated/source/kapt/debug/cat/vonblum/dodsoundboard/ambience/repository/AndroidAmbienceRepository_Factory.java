package cat.vonblum.dodsoundboard.ambience.repository;

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
public final class AndroidAmbienceRepository_Factory implements Factory<AndroidAmbienceRepository> {
  private final Provider<Context> contextProvider;

  public AndroidAmbienceRepository_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public AndroidAmbienceRepository get() {
    return newInstance(contextProvider.get());
  }

  public static AndroidAmbienceRepository_Factory create(Provider<Context> contextProvider) {
    return new AndroidAmbienceRepository_Factory(contextProvider);
  }

  public static AndroidAmbienceRepository newInstance(Context context) {
    return new AndroidAmbienceRepository(context);
  }
}
