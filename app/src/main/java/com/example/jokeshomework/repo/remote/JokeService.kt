package com.example.jokeshomework.repo.remote

import com.example.jokeshomework.model.JokeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface JokeService {

    @GET("Any?blacklistFlags=nsfw,religious,racist,sexist,explicit&amount=10")
    fun getJoke(
    ): Call<JokeResponse>
}