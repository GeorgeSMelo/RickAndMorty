package com.example.rickandmorty.login.data.model

data class CharacterResponseDTO(
    val info: InfoDTO,
    val results: List<CharacterResponseDTO>

)
