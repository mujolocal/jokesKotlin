package com.example.jokeshomework.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.jokeshomework.model.Joke
import com.example.jokeshomework.model.JokeResponse
import com.example.jokeshomework.repo.JokeRepo
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.lang.Exception

class MainViewModel: ViewModel() {
    private  val TAG = "MainViewModel"
    lateinit var jokeResponse:JokeResponse

    private val _jokes = MutableLiveData<JokeResponse>()

    val jokes:LiveData<JokeResponse>
        get() = _jokes

    fun requestJokes(){

        val callback : Callback<JokeResponse> = object: Callback<JokeResponse> {
            override fun onResponse(
                call: Call<JokeResponse>,
                response: Response<JokeResponse>
            ) {
                _jokes.value =  response.body()
            }

            override fun onFailure(call: Call<JokeResponse>, t: Throwable) {
                Log.d(TAG, "onFailure: "+t)
            }

        }

        JokeRepo.jokeService.getJoke().enqueue(callback)
    }
}