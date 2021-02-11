package com.example.jokeshomework.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class JokeResponse(
    val amount: Int,
    val error: Boolean,
    val jokes: List<Joke>
)