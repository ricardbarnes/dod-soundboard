package cat.vonblum.dodsoundboard;

import cat.vonblum.dodsoundboard.ambience.application.find.FindAmbiencesQueryHandler;
import cat.vonblum.dodsoundboard.ambience.application.play.PlayAmbienceCommandHandler;
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
  private final Provider<PlayAmbienceCommandHandler> playAmbienceCommandHandlerProvider;

  private final Provider<FindAmbiencesQueryHandler> findAmbiencesQueryHandlerProvider;

  public MainActivity_MembersInjector(
      Provider<PlayAmbienceCommandHandler> playAmbienceCommandHandlerProvider,
      Provider<FindAmbiencesQueryHandler> findAmbiencesQueryHandlerProvider) {
    this.playAmbienceCommandHandlerProvider = playAmbienceCommandHandlerProvider;
    this.findAmbiencesQueryHandlerProvider = findAmbiencesQueryHandlerProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<PlayAmbienceCommandHandler> playAmbienceCommandHandlerProvider,
      Provider<FindAmbiencesQueryHandler> findAmbiencesQueryHandlerProvider) {
    return new MainActivity_MembersInjector(playAmbienceCommandHandlerProvider, findAmbiencesQueryHandlerProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectPlayAmbienceCommandHandler(instance, playAmbienceCommandHandlerProvider.get());
    injectFindAmbiencesQueryHandler(instance, findAmbiencesQueryHandlerProvider.get());
  }

  @InjectedFieldSignature("cat.vonblum.dodsoundboard.MainActivity.playAmbienceCommandHandler")
  public static void injectPlayAmbienceCommandHandler(MainActivity instance,
      PlayAmbienceCommandHandler playAmbienceCommandHandler) {
    instance.playAmbienceCommandHandler = playAmbienceCommandHandler;
  }

  @InjectedFieldSignature("cat.vonblum.dodsoundboard.MainActivity.findAmbiencesQueryHandler")
  public static void injectFindAmbiencesQueryHandler(MainActivity instance,
      FindAmbiencesQueryHandler findAmbiencesQueryHandler) {
    instance.findAmbiencesQueryHandler = findAmbiencesQueryHandler;
  }
}
