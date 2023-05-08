package cat.vonblum.dodsoundboard;

import cat.vonblum.dodsoundboard.shared.domain.bus.command.CommandBus;
import cat.vonblum.dodsoundboard.shared.domain.bus.query.QueryBus;
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
  private final Provider<CommandBus> commandBusProvider;

  private final Provider<QueryBus> queryBusProvider;

  public MainActivity_MembersInjector(Provider<CommandBus> commandBusProvider,
      Provider<QueryBus> queryBusProvider) {
    this.commandBusProvider = commandBusProvider;
    this.queryBusProvider = queryBusProvider;
  }

  public static MembersInjector<MainActivity> create(Provider<CommandBus> commandBusProvider,
      Provider<QueryBus> queryBusProvider) {
    return new MainActivity_MembersInjector(commandBusProvider, queryBusProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectCommandBus(instance, commandBusProvider.get());
    injectQueryBus(instance, queryBusProvider.get());
  }

  @InjectedFieldSignature("cat.vonblum.dodsoundboard.MainActivity.commandBus")
  public static void injectCommandBus(MainActivity instance, CommandBus commandBus) {
    instance.commandBus = commandBus;
  }

  @InjectedFieldSignature("cat.vonblum.dodsoundboard.MainActivity.queryBus")
  public static void injectQueryBus(MainActivity instance, QueryBus queryBus) {
    instance.queryBus = queryBus;
  }
}
