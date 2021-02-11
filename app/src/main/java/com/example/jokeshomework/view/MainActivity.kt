package com.example.jokeshomework.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.jokeshomework.R
import com.example.jokeshomework.databinding.ActivityMainBinding
import com.example.jokeshomework.model.Joke
import com.example.jokeshomework.model.JokeResponse
import com.example.jokeshomework.repo.JokeRepo
import com.example.jokeshomework.viewModel.MainViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    private val JOKESPACKAGEKEY: String = "jokespackagekey"
    private val viewModel: MainViewModel by viewModels<MainViewModel>()
    private lateinit var binding: ActivityMainBinding
    private lateinit var jokeResponse: JokeResponse
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel.jokes.observe(this) { response ->
            jokeResponse = response;
            Log.d(TAG, "onCreate: $jokeResponse")
        }


        setListeners()
    }

    fun setListeners() {
        binding.requestButton.setOnClickListener {
            binding.txt1.text = "change is good"
            viewModel.requestJokes()

        }
        binding.nextBtn.setOnClickListener {
            var intent: Intent =
                Intent(this, JokesActivity::class.java).putExtra(JOKESPACKAGEKEY, jokeResponse)
            startActivity(intent)
        }
    }
}