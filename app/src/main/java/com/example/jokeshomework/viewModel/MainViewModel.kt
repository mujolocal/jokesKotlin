package com.example.jokeshomework.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.jokeshomework.repo.JokeRepo
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel: ViewModel() {
    private  val TAG = "MainViewModel"

    fun requestJokes(){

        val callback : Callback<List<String>> = object: Callback<List<String>> {
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