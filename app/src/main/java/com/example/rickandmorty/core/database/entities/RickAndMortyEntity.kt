package com.example.rickandmorty.core.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("Informacion")
data class RickAndMortyEntity (
    @PrimaryKey(autoGenerate = true)
    val id: Int
)