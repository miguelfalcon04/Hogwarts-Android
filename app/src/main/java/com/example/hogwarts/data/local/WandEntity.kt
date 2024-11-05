package com.example.hogwarts.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wand")
data class WandEntity (
    @PrimaryKey val id: String,
                val wood: String,
                val core: String,
                val length: Int
)