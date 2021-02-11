package com.example.jokeshomework.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Flags(
    val explicit: Boolean,
    val nsfw: Boolean,
    val political: Boolean,
    val racist: Boolean,
    val religious: Boolean,
    val sexist: Boolean
)