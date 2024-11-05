package com.example.hogwarts.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [WizardEntity::class],
    version = 1
)
abstract class WizardDataBase: RoomDatabase() {
    abstract fun wizardDao(): WizardDao
}