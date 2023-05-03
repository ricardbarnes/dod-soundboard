package cat.vonblum.dodsoundboard;

import cat.vonblum.dodsoundboard.ambience.application.find.FindAmbiencesQueryHandler;
import cat.vonblum.dodsoundboard.ambience.application.play.AmbiencePlayerCommandHandler;
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

  private final Provider<AmbiencePlayerCommandHandler> ambiencePlayerCommandHandlerProvider;

  private final Provider<FindAmbiencesQueryHandler> findAmbiencesQueryHandlerProvider;

  public MainActivity_MembersInjector(Provider<AmbienceRepository> ambienceRepositoryProvider,
      Provider<AmbienceProvider> ambienceProvider,
      Provider<AmbiencePlayerCommandHandler> ambiencePlayerCommandHandlerProvider,
      Provider<FindAmbiencesQueryHandler> findAmbiencesQueryHandlerProvider) {
    this.ambienceRepositoryProvider = ambienceRepositoryProvider;
    this.ambienceProvider = ambienceProvider;
    this.ambiencePlayerCommandHandlerProvider = ambiencePlayerCommandHandlerProvider;
    this.findAmbiencesQueryHandlerProvider = findAmbiencesQueryHandlerProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<AmbienceRepository> ambienceRepositoryProvider,
      Provider<AmbienceProvider> ambienceProvider,
      Provider<AmbiencePlayerCommandHandler> ambiencePlayerCommandHandlerProvider,
      Provider<FindAmbiencesQueryHandler> findAmbiencesQueryHandlerProvider) {
    return new MainActivity_MembersInjector(ambienceRepositoryProvider, ambienceProvider, ambiencePlayerCommandHandlerProvider, findAmbiencesQueryHandlerProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectAmbienceRepository(instance, ambienceRepositoryProvider.get());
    injectAmbienceProvider(instance, ambienceProvider.get());
    injectAmbiencePlayerCommandHandler(instance, ambiencePlayerCommandHandlerProvider.get());
    injectFindAmbiencesQueryHandler(instance, findAmbiencesQueryHandlerProvider.get());
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

  @InjectedFieldSignature("cat.vonblum.dodsoundboard.MainActivity.ambiencePlayerCommandHandler")
  public static void injectAmbiencePlayerCommandHandler(MainActivity instance,
      AmbiencePlayerCommandHandler ambiencePlayerCommandHandler) {
    instance.ambiencePlayerCommandHandler = ambiencePlayerCommandHandler;
  }

  @InjectedFieldSignature("cat.vonblum.dodsoundboard.MainActivity.findAmbiencesQueryHandler")
  public static void injectFindAmbiencesQueryHandler(MainActivity instance,
      FindAmbiencesQueryHandler findAmbiencesQueryHandler) {
    instance.findAmbiencesQueryHandler = findAmbiencesQueryHandler;
  }
}
