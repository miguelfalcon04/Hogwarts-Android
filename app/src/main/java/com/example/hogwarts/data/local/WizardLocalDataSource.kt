package com.example.hogwarts.data.local

import com.example.hogwarts.data.Wizard
import kotlinx.coroutines.flow.Flow

interface WizardLocalDataSource {

    suspend fun insert(wizards: List<Wizard>)
    suspend fun readAll(): List<Wizard>
    fun observeAll():Flow<List<Wizard>>

}