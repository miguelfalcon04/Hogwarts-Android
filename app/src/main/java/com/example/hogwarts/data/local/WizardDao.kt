package com.example.hogwarts.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao // Data Access Object, Metodos para Interectuar con la base de datos
interface WizardDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE) // Si el mago ya existe lo reemplaza
    suspend fun create(wizard: WizardEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun create(wizards: List<WizardEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun create(vararg wizards: WizardEntity) // Se le puede pasar varios magos a la función como argumentos separados

    @Update
    suspend fun update(wizard: WizardEntity)

    @Query("SELECT * FROM wizard")
    suspend fun readAll(): List<WizardEntity>

    @Query("SELECT * FROM wizard")
    fun observeAll(): Flow<List<WizardEntity>> //Actualiza en tiempo real cuando se producen cambios
}
