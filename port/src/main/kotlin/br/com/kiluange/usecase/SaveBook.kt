package br.com.kiluange.usecase

import br.com.kiluange.Book

interface SaveBook {
    suspend fun saveBook(name: String): Book
    suspend fun saveBook(name: String, categories: Array<String>): Book
}