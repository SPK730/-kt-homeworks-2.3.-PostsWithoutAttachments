package ru.netology

data class Likes(
    val count: Int
)

data class Post(
    var likes: Likes,
    val idPost: Int,
    val ownerId: Long,
    val fromId: Long,
    val created_by: Long,
    val date: Long,
    val text: String,
    val reply_owner_id: Long,
    val reply_post_id: Long,
    val friends_only: Boolean,
    val comments: Int,
    val copyright: String,
//  val likes: Int = 0,
    val reposts: Post?,
    val views: Post?,
    val post_type: Post?,
    val post_source: Post?,
    // var attachments: Array<Attachment> = emptyArray<Attachment>() // val attachments: Array<Attachment> = emptyArray() из вопросов
    val geo: Post?,
    val signer_id: Long,
    var copyHistory: Post?,
    val canPin: Boolean,
    var canDelete: Boolean,
    var canEdit: Boolean,
    val isPinned: Boolean,
    var markedAsAds: Boolean,
    var isFavorite: Boolean,
)


object WallService {
    private var posts = emptyArray<Post>()
    private var lastId = 0
    fun clear() {
        posts = emptyArray()
        lastId = 0   // также здесь нужно сбросить счетчик для id постов, если он у вас используется
    }

    fun add(post: Post): Post {
        posts += post.copy(idPost = ++lastId, likes = post.likes.copy())
        return posts.last()
    }


    fun update(newPost: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (post.idPost == newPost.idPost) {
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
    WallService.add(
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
    WallService.add(
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
        )
    )

    WallService.printPosts()
    WallService.update(
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
        )
    )
    WallService.update(
        Post(
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
        )
    )
    val video1 = Video(
        123,
        12234,
        "title video1",
        "video dsc",
        10,

        )

    val audio1 = Audio(
        10,
        12454353,
        "artist",
        "title",
        3234,

        )

    val photo1 = Photo(
        4358394,
        324,
        234545435,
        54645,
        "text",
    )

    val note1 = Note(
        34543543,
        334543543,
        "title",
        "text",
        23423525,
    )

    val gift1 = Gift(
        33,
        "256",
        "96",
        "48"
    )
    val attachmentVideo1 = VideoAttachment(video1)
    val attachmentAudio1 = AudioAttachment(audio1)
    val attachmentPhoto1 = PhotoAttachment(photo1)
    val attachmentNote1 = NoteAttachment(note1)
    val attachmentGift1 = GiftAttachment(gift1)
}

