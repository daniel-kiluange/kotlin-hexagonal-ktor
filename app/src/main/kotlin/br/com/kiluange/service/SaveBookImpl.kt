package br.com.kiluange.service

import br.com.kiluange.Book
import br.com.kiluange.usecase.SaveBook

class SaveBookImpl : SaveBook {
    override suspend fun saveBook(name: String): Book {
        val builder: Book.Builder = Book.Builder("Teste")
            .category("não categorizado")
        return builder.build()
    }
}