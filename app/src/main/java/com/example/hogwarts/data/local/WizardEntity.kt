package com.example.hogwarts.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wizard")
data class WizardEntity (
    @PrimaryKey val id: String,
                val name: String,
                val gender: String,
                val house: String,
                val wandId: String,
                val patronous: String,
                val actor: String,
                val image: String
)