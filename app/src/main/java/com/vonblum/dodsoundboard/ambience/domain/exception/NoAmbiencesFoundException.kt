package com.vonblum.dodsoundboard.ambience.domain.exception

import com.vonblum.dodsoundboard.shared.domain.DomainException

class NoAmbiencesFoundException : DomainException(DEFAULT_MESSAGE) {

    companion object {

        const val DEFAULT_MESSAGE = "No ambiences found.";

    }

}