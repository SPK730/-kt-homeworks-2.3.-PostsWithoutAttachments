package ru.netology

data class Note(
    val id : Int, // Идентификатор заметки.
    val owner_id : Int, // Идентификатор владельца заметки.
    val title : String, // Заголовок заметки.
    val text : String, // Текст заметки.
    val date : Int, // Дата создания заметки в формате Unixtime.
)