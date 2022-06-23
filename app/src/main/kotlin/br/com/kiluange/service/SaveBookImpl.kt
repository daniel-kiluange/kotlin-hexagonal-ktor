package br.com.kiluange.service

import br.com.kiluange.Book
import br.com.kiluange.usecase.SaveBook
import java.util.*

class SaveBookImpl : SaveBook {
    override suspend fun saveBook(name: String): Book {
        return Book(UUID.randomUUID(), name)
    }
}