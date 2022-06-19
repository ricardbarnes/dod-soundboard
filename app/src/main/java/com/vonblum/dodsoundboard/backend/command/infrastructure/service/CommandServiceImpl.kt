package com.vonblum.dodsoundboard.backend.command.infrastructure.service

import com.vonblum.dodsoundboard.backend.command.CommandService
import javax.inject.Inject

class CommandServiceImpl @Inject constructor() : CommandService {
    override fun run(): String {
        return "This is the SERVICE working!"
    }
}