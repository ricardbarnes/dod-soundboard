package cat.vonblum.dodsoundboard.shared.exception

abstract class DomainException(
    override val message: String? = null,
    override val cause: Throwable? = null
) :
    RuntimeException(message, cause)