package br.com.kiluange.plugins

import br.com.kiluange.service.SaveBookImpl
import br.com.kiluange.usecase.SaveBook
import io.ktor.server.application.*
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import org.koin.ktor.plugin.Koin

val saveBookModule = module {
    singleOf(::SaveBookImpl) { bind<SaveBook>() }
}

fun Application.configureKoin() {
    install(Koin) {
        modules(saveBookModule)
    }
}