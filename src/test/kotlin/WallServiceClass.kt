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
        //service.add(Post(1, Likes(0)))
        val result = service.add(
            Post(1, Likes(0), 1547, 198460000, "какой-то текст", "(c)", "copy", true, false, false)
        )
        assertTrue(result.id > 0)
    }

    @Test
    fun updateExistingPostTest() {// создаём целевой сервис
        val service = WallService  // заполняем несколькими постами
        service.add(Post(1, Likes(0), 1547, 198460000, "какой-то текст", "(c)", "copy", true, false, false))
        service.add(Post(2, Likes(4), 1414, 198760000, "другой текст", "(c)", "copy", true, false, false))
        service.add(Post(3, Likes(10), 1247, 199460000, "еще какой-то текст", "(c)", "copy", true, false, false))
        // создаём информацию об обновлении
        val update = Post(1, Likes(10), 1147, 190460000, "и еще какой-то текст", "(c)", "copy", true, false, false)
        val result = service.update(update)
        assertTrue(result) // проверяем результат (используйте assertTrue или assertFalse)
    }

    @Test
    fun updateNotExistingPostTest() {// создаём целевой сервис
        val service = WallService  // заполняем несколькими постами
        service.add(Post(1, Likes(0), 1547, 198460000, "какой-то текст", "(c)", "copy", true, false, false))
        service.add(Post(2, Likes(4), 1414, 198760000, "другой текст", "(c)", "copy", true, false, false))
        service.add(Post(3, Likes(10), 1247, 199460000, "еще какой-то текст", "(c)", "copy", true, false, false))
        // создаём информацию об обновлении
        val update = Post(4, Likes(10), 1147, 190460000, "и еще какой-то текст", "(c)", "copy", true, false, false)
        val result = service.update(update)
        assertFalse(result) // проверяем результат (используйте assertTrue или assertFalse)
    }

}