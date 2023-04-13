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
                null,//???
                36546464,
                656464,
                canPin = true,
                canDelete = false,
                canEdit = true,
                isPinned = false,
                copyHistory = null,
                markedAsAds = false
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
                        null,//???
                        36546464,
                        656464,
                        canPin = true,
                        canDelete = false,
                        canEdit = true,
                        isPinned = false,
                        copyHistory = null,
                        markedAsAds = false
                    ))
        )
        service.add(
            (
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
                        null,//???
                        36546464,
                        656464,
                        canPin = true,
                        canDelete = false,
                        canEdit = true,
                        isPinned = false,
                        copyHistory = null,
                        markedAsAds = false
                    ))
        )

        service.add(
            (Post(
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
                null,//???
                36546464,
                656464,
                canPin = true,
                canDelete = false,
                canEdit = true,
                isPinned = false,
                copyHistory = null,
                markedAsAds = false
            ))
        )
        // создаём информацию об обновлении
        val update = Post(
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
            null,//???
            36546464,
            656464,
            canPin = true,
            canDelete = false,
            canEdit = true,
            isPinned = false,
            copyHistory = null,
            markedAsAds = false
        )

        val result = service.update(update)
        assertTrue(result) // проверяем результат (используйте assertTrue или assertFalse)
    }

    @Test
    fun updateNotExistingPostTest() {// создаём целевой сервис
        val service = WallService  // заполняем несколькими постами
        service.add(
            (
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
                        null,//???
                        36546464,
                        656464,
                        canPin = true,
                        canDelete = false,
                        canEdit = true,
                        isPinned = false,
                        copyHistory = null,
                        markedAsAds = false
                    ))
        )
        service.add(
            (
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
                        null,//???
                        36546464,
                        656464,
                        canPin = true,
                        canDelete = false,
                        canEdit = true,
                        isPinned = false,
                        copyHistory = null,
                        markedAsAds = false
                    ))
        )

        service.add(
            (Post(
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
                null,//???
                36546464,
                656464,
                canPin = true,
                canDelete = false,
                canEdit = true,
                isPinned = false,
                copyHistory = null,
                markedAsAds = false
            ))
        )
        // создаём информацию об обновлении
        val update = Post(
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
            null,//???
            36546464,
            656464,
            canPin = true,
            canDelete = false,
            canEdit = true,
            isPinned = false,
            copyHistory = null,
            markedAsAds = false
        )

        val result = service.update(update)
        assertTrue(result) // проверяем результат (используйте assertTrue или assertFalse)
    }

}