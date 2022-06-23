package br.com.kiluange

import br.com.kiluange.controller.configureRouting
import br.com.kiluange.plugins.configureKoin
import br.com.kiluange.plugins.configureSerialization
import io.ktor.server.application.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    configureRouting()
    configureSerialization()
    configureKoin()
}