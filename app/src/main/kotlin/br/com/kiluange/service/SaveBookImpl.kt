package br.com.kiluange.service

import br.com.kiluange.Book
import br.com.kiluange.usecase.SaveBook

class SaveBookImpl : SaveBook {
    override suspend fun saveBook(name: String): Book {
        val builder: Book.Builder = Book.Builder("Test")
            .category("uncategorized")
        return builder.build()
    }

    override suspend fun saveBook(name: String, categories: Array<String>): Book {
        val builder: Book.Builder = Book.Builder(name)
        for (category in categories) {
            builder.category(category)
        }
        return builder.build()
    }
}