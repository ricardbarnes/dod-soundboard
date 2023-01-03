package com.vonblum.dodsoundboard.shared.domain

abstract class DomainException(
    override val message: String? = null,
    override val cause: Throwable? = null
) :
    RuntimeException(message, cause)