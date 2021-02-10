package com.example.jokeshomework.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.jokeshomework.R
import com.example.jokeshomework.databinding.ActivityMainBinding
import com.example.jokeshomework.repo.JokeRepo
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
       setListeners()
    }
    fun setListeners(){
        binding.requestButton.setOnClickListener {
            binding.txt1.text = "change is good"

            val callback : Callback<List<String>> = object: Callback<List<String>>{
                override fun onResponse(
                    call: Call<List<String>>,
                    response: Response<List<String>>
                ) {
                    Log.d(TAG, "onResponse: "+response.body())
                }

                override fun onFailure(call: Call<List<String>>, t: Throwable) {
                    Log.d(TAG, "onFailure: ")
                }

            }
            JokeRepo.jokeService.getJoke(10).enqueue(callback)
        }

    }
}