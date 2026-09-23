package com.example.rickandmorty.core.internet

import retrofit2.http.GET

interface RickAndMortyApi {
    @GET("character")
    suspend fun getCharacter()

    @GET("location")
    suspend fun getLocation()

    @GET("episode")
    suspend fun getEpisode()

}