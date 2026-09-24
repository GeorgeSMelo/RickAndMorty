package com.example.rickandmorty.core.database.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface RickAndMortyDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun guardarUsuario()

    @Query("SELECT * FROM Informacion")
    suspend fun obtenerInformacion()

    @Query("DELETE FROM Informacion")
    suspend fun limpiarImformacion()

}