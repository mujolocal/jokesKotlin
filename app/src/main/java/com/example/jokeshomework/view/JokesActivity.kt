package com.example.jokeshomework.view

import android.os.Binder
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.jokeshomework.R
import com.example.jokeshomework.databinding.ActivityJokesBinding
import com.example.jokeshomework.model.JokeResponse

class JokesActivity: AppCompatActivity() {
    val JOKESPACKAGEKEY: String = "jokespackagekey"
    lateinit var binder: ActivityJokesBinding
    lateinit var jokeResponse: JokeResponse

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binder = DataBindingUtil.setContentView(this, R.layout.activity_jokes)
        jokeResponse = intent.getSerializableExtra(JOKESPACKAGEKEY) as JokeResponse
        binder.txt2.text = jokeResponse.jokes.toString()


    }

}