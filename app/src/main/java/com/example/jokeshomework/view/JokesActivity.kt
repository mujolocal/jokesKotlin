package com.example.jokeshomework.view

import android.os.Binder
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.jokeshomework.R
import com.example.jokeshomework.adapters.JokeAdapter
import com.example.jokeshomework.databinding.ActivityJokesBinding
import com.example.jokeshomework.model.JokeResponse

class JokesActivity: AppCompatActivity() {
    private  val TAG = "JokesActivity"
    val JOKESPACKAGEKEY: String = "jokespackagekey"
    lateinit var binder: ActivityJokesBinding
    lateinit var jokeResponse: JokeResponse
    lateinit var recyclerView: RecyclerView
    lateinit var jokeAdapter: JokeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binder = DataBindingUtil.setContentView(this, R.layout.activity_jokes)
        jokeResponse = intent.getSerializableExtra(JOKESPACKAGEKEY) as JokeResponse
        val jokes = jokeResponse.jokes
        Log.d(TAG, "onCreate: "+jokes.size)
        jokeAdapter = JokeAdapter(jokes, this)
        recyclerView = binder.jokeRv
        val linearLayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = linearLayoutManager
        recyclerView.adapter = jokeAdapter





    }

}