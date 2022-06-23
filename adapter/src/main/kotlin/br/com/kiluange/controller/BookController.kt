package br.com.kiluange.controller

import br.com.kiluange.usecase.SaveBook
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject


fun Route.bookRoute(){
    val service: SaveBook by inject()

    route("/book"){
        get {
            call.respondText(service.saveBook("daniel").name)
        }
    }
}