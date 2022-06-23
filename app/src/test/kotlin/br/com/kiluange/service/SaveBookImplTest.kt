package br.com.kiluange.service

import br.com.kiluange.Book
import br.com.kiluange.plugins.saveBookModule
import br.com.kiluange.usecase.SaveBook
import kotlinx.coroutines.runBlocking
import org.junit.Rule
import org.junit.Test
import org.koin.core.logger.Level
import org.koin.test.KoinTest
import org.koin.test.KoinTestRule
import org.koin.test.mock.MockProviderRule
import org.koin.test.mock.declareMock
import org.mockito.Mockito
import org.mockito.kotlin.given
import java.util.*
import kotlin.test.assertEquals


internal class SaveBookImplTest : KoinTest {

    @get:Rule
    val koinTestRule = KoinTestRule.create {
        printLogger(Level.DEBUG)
        modules(saveBookModule)
    }

    @get:Rule
    val mockProvider = MockProviderRule.create { clazz ->
        Mockito.mock(clazz.java)
    }


    @Test
    fun `save Book Test`() = runBlocking {
        val service = declareMock<SaveBook> {
            given(runBlocking { saveBook("Daniel") })
                .willReturn(Book(UUID.randomUUID(), "Daniel"))
        }
        assertEquals("Daniel", service.saveBook("Daniel").name)
    }
}