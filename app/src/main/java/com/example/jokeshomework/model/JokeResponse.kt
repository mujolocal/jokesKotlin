package com.example.jokeshomework.model

import com.squareup.moshi.JsonClass
import java.io.Serializable

@JsonClass(generateAdapter = true)
data class JokeResponse(
    val amount: Int,
    val error: Boolean,
    val jokes: List<Joke>
):Serializable