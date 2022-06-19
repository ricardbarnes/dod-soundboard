package com.vonblum.dodsoundboard.backend.command

import javax.inject.Inject

class Command @Inject constructor() {
    fun run(): String {
        return "This is a command!"
    }
}