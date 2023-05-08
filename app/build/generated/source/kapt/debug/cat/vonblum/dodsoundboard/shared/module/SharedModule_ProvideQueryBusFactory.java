package cat.vonblum.dodsoundboard.shared.module;

import cat.vonblum.dodsoundboard.ambience.application.find.FindAmbiencesQueryHandler;
import cat.vonblum.dodsoundboard.shared.domain.bus.query.QueryBus;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class SharedModule_ProvideQueryBusFactory implements Factory<QueryBus> {
  private final SharedModule module;

  private final Provider<FindAmbiencesQueryHandler> findAmbiencesQueryHandlerProvider;

  public SharedModule_ProvideQueryBusFactory(SharedModule module,
      Provider<FindAmbiencesQueryHandler> findAmbiencesQueryHandlerProvider) {
    this.module = module;
    this.findAmbiencesQueryHandlerProvider = findAmbiencesQueryHandlerProvider;
  }

  @Override
  public QueryBus get() {
    return provideQueryBus(module, findAmbiencesQueryHandlerProvider.get());
  }

  public static SharedModule_ProvideQueryBusFactory create(SharedModule module,
      Provider<FindAmbiencesQueryHandler> findAmbiencesQueryHandlerProvider) {
    return new SharedModule_ProvideQueryBusFactory(module, findAmbiencesQueryHandlerProvider);
  }

  public static QueryBus provideQueryBus(SharedModule instance,
      FindAmbiencesQueryHandler findAmbiencesQueryHandler) {
    return Preconditions.checkNotNullFromProvides(instance.provideQueryBus(findAmbiencesQueryHandler));
  }
}
