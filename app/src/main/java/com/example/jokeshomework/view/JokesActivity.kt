package com.example.jokeshomework.view

import android.os.Binder
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.jokeshomework.R
import com.example.jokeshomework.databinding.ActivityJokesBinding

class JokesActivity: AppCompatActivity() {
    lateinit var binder: ActivityJokesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binder = DataBindingUtil.setContentView(this, R.layout.activity_jokes)

    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onPostResume() {
        super.onPostResume()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}