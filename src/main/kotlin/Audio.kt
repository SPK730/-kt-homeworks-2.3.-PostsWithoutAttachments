package ru.netology

data class Audio(
    val id : Int, // Идентификатор аудиозаписи.
    val owner_id : Int, // Идентификатор владельца аудиозаписи.
    val artist : String, // Исполнитель
    val title : String, // Название композиции
    val duration : Int, // Длительность аудиозаписи в секундах
)
