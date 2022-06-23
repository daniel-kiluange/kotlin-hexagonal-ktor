package br.com.kiluange.controller

import br.com.kiluange.controller.bookRoute
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlin.math.log

fun Application.configureRouting() {
    routing {
        bookRoute()
        get("/") {
            call.respondText("Hello World!")
        }
    }
}
