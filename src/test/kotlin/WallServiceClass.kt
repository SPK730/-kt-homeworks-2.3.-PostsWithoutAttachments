package ru.netology


import org.junit.Test
import org.junit.Assert.*
import org.junit.Before


class WallServiceTest {
    @Before
    fun clearBeforeTest() {
        WallService.clear()
    }

    //annotation class Before

    @Test
    fun addPostTest() {
        val service = WallService
        val result = service.add(
            Post(
                Likes(11),
                2,
                4,
                5,
                6544,
                654646,
                "Какой-то текст",
                547411,
                4581,
                false,
                5874,
                "(c)",
                null,
                null,
                null,
                null,
                null,
                534654,
                null,
                canPin = true,
                canDelete = false,
                canEdit = true,
                isPinned = false,
                false,
                true
            )
        )
        assertTrue(result.idPost > 0)
    }

    @Test
    fun updateExistingPostTest() {// создаём целевой сервис
        val service = WallService  // заполняем несколькими постами
        service.add(
            (
                    Post(
                        Likes(15),
                        8,
                        4,
                        5,
                        25,
                        64684,
                        "Другой текст",
                        547411,
                        4581,
                        false,
                        5874,
                        "(c)",
                        null,
                        null,
                        null,
                        null,
                        null,
                        546464897,
                        null,
                        canPin = true,
                        canDelete = false,
                        canEdit = true,
                        isPinned = false,
                        false,
                        true
                    ))
        )
        service.add(
            (
                    Post(
                        Likes(15),
                        8,
                        4,
                        5,
                        25,
                        64684,
                        "Другой текст",
                        547411,
                        4581,
                        false,
                        5874,
                        "(c)",
                        null,
                        null,
                        null,
                        null,
                        null,
                        546464897,
                        null,
                        canPin = true,
                        canDelete = false,
                        canEdit = true,
                        isPinned = false,
                        markedAsAds = false,
                        isFavorite = true
                    ))
        )

        service.add(
            (Post(
                Likes(16),
                5,
                4,
                5,
                25,
                147226,
                "Другой текст",
                547411,
                4581,
                true,
                5874,
                "(c)",
                null,
                null,
                null,
                null,
                null,
                65214,
                null,
                canPin = true,
                canDelete = false,
                canEdit = true,
                isPinned = false,
                markedAsAds = false,
                isFavorite = true
            ))
        )
        // создаём информацию об обновлении
        val update = Post(
            Likes(16),
            6,
            4,
            5,
            25,
            147226,
            "Другой текст",
            547411,
            4581,
            true,
            5874,
            "(c)",
            null,
            null,
            null,
            null,
            null,
            65214,
            null,
            canPin = true,
            canDelete = false,
            canEdit = true,
            isPinned = false,
            markedAsAds = false,
            isFavorite = true
        )

        val result = service.update(update)
        assertFalse(result) // проверяем результат (используйте assertTrue или assertFalse)
    }

    @Test
    fun updateNotExistingPostTest() {// создаём целевой сервис
        val service = WallService  // заполняем несколькими постами
        service.add(
            (
                    Post(
                        Likes(15),
                        8,
                        4,
                        5,
                        25,
                        64684,
                        "Другой текст",
                        547411,
                        4581,
                        false,
                        5874,
                        "(c)",
                        null,
                        null,
                        null,
                        null,
                        null,
                        546464897,
                        null,
                        canPin = true,
                        canDelete = false,
                        canEdit = true,
                        isPinned = false,
                        false,
                        true
                    ))
        )
        service.add(
            (
                    Post(
                        Likes(15),
                        8,
                        4,
                        5,
                        25,
                        64684,
                        "Другой текст",
                        547411,
                        4581,
                        false,
                        5874,
                        "(c)",
                        null,
                        null,
                        null,
                        null,
                        null,
                        546464897,
                        null,
                        canPin = true,
                        canDelete = false,
                        canEdit = true,
                        isPinned = false,
                        markedAsAds = false,
                        isFavorite = true
                    ))
        )

        service.add(
            (Post(
                Likes(16),
                5,
                4,
                5,
                25,
                147226,
                "Другой текст",
                547411,
                4581,
                true,
                5874,
                "(c)",
                null,
                null,
                null,
                null,
                null,
                65214,
                null,
                canPin = true,
                canDelete = false,
                canEdit = true,
                isPinned = false,
                markedAsAds = false,
                isFavorite = true
            ))
        )
        // создаём информацию об обновлении
        val update = Post(
            Likes(16),
            5,
            4,
            5,
            27,
            147226,
            "Другой текст",
            547411,
            4581,
            true,
            5874,
            "(c)",
            null,
            null,
            null,
            null,
            null,
            65214,
            null,
            canPin = true,
            canDelete = false,
            canEdit = true,
            isPinned = false,
            markedAsAds = false,
            isFavorite = true
        )

        val result = service.update(update)
        assertFalse(result) // проверяем результат (используйте assertTrue или assertFalse)
    }

}