package cat.vonblum.dodsoundboard;

import cat.vonblum.dodsoundboard.ambience.ports.AmbienceProvider;
import cat.vonblum.dodsoundboard.ambience.ports.AmbienceRepository;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<AmbienceRepository> ambienceRepositoryProvider;

  private final Provider<AmbienceProvider> ambienceProvider;

  public MainActivity_MembersInjector(Provider<AmbienceRepository> ambienceRepositoryProvider,
      Provider<AmbienceProvider> ambienceProvider) {
    this.ambienceRepositoryProvider = ambienceRepositoryProvider;
    this.ambienceProvider = ambienceProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<AmbienceRepository> ambienceRepositoryProvider,
      Provider<AmbienceProvider> ambienceProvider) {
    return new MainActivity_MembersInjector(ambienceRepositoryProvider, ambienceProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectAmbienceRepository(instance, ambienceRepositoryProvider.get());
    injectAmbienceProvider(instance, ambienceProvider.get());
  }

  @InjectedFieldSignature("cat.vonblum.dodsoundboard.MainActivity.ambienceRepository")
  public static void injectAmbienceRepository(MainActivity instance,
      AmbienceRepository ambienceRepository) {
    instance.ambienceRepository = ambienceRepository;
  }

  @InjectedFieldSignature("cat.vonblum.dodsoundboard.MainActivity.ambienceProvider")
  public static void injectAmbienceProvider(MainActivity instance,
      AmbienceProvider ambienceProvider) {
    instance.ambienceProvider = ambienceProvider;
  }
}
