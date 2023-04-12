package ru.netology

data class Video(
    val id : Int, //	Идентификатор видеозаписи
    val owneId : Int, // Идентификатор владельца видеозаписи
    val title : String, // Название видеозаписи
    val description : String, // Текст описания видеозаписи
    val duration : Int, // Длительность ролика в секундах
)