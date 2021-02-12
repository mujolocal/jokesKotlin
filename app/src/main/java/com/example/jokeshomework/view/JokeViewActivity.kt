package com.example.jokeshomework.view

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.setContentView
import com.example.jokeshomework.R
import com.example.jokeshomework.databinding.ActivityJokesBinding
import com.example.jokeshomework.databinding.ActivityJokeviewBinding

class JokeViewActivity: AppCompatActivity() {
    lateinit var binding: ActivityJokeviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_jokeview)



    }
}