package br.com.kiluange

import java.util.*

data class Book(val id: UUID, val name: String, val categories: List<String> = mutableListOf()) {

    class Builder(var name: String, var categories: MutableList<String> = mutableListOf()) {

        fun categories(value: MutableList<String>): Builder {
            this.categories = value
            return this
        }

        fun category(value: String): Builder {
            this.categories.add(value)
            return this
        }

        fun build() = Book(UUID.randomUUID(), name, categories)
    }

    fun toBuilder() = Builder(this.name, this.categories.toMutableList())

}
