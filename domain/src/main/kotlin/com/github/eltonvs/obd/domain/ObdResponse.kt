package com.github.eltonvs.obd.domain

import com.github.eltonvs.obd.command.ObdCommand

data class ObdResponse(
    val command: ObdCommand,
    val rawResponse: ObdRawResponse
)