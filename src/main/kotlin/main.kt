package ru.netology

data class Likes(
    val count: Int
)

data class Post(
    var id: Int = 1,
    var likes: Likes,
    var ownerId: Int = 54254,
    var date: Int = 1_671_408_000,
    var text: String = "Simply Post Text",
    var copyright: String = "(c)",
    var post_type: String = "copy",
    var can_pin: Boolean = true,
    var can_delete: Boolean = false,
    var marked_as_ads: Boolean = false

)

object WallService {
    private var posts = emptyArray<Post>()
    private var lastId = 0
    fun clear() {
        posts = emptyArray()
        lastId = 0   // также здесь нужно сбросить счетчик для id постов, если он у вас используется
    }

    fun add(post: Post): Post {
        posts += post.copy(id = ++lastId, likes = post.likes.copy())
        return posts.last()
    }


    fun update(newPost: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (post.id == newPost.id) {
                posts[index] = newPost.copy(likes = post.likes.copy())
                return true
            }
        }
        return false
    }


    fun printPosts() {
        for (post in posts) {
            println(post)
        }
        println()
    }
}

fun main() {
    WallService.add(Post(1, Likes(0)))
    WallService.add(Post(2, Likes(10)))
    WallService.printPosts()
    WallService.update(Post(1, Likes(0)))
    WallService.update(Post(2, Likes(10)))
}

