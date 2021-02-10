package com.example.jokeshomework.repo.remote

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface JokeService {

    @GET("shibes")
    fun getJoke(
        @Query("count") count: Int
    ): Call<List<String>>
}