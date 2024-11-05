package com.example.hogwarts.data

data class Wizards (
    val id: String = "",
    val name: String = "",
    val gender: String = "",
    val house: String = "",
    val wand: Wand,
    val patronous: String = "",
    val actor: String = "",
    val image: String = ""
)