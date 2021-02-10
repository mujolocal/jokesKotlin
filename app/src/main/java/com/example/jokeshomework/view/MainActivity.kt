package com.example.jokeshomework.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.jokeshomework.R
import com.example.jokeshomework.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
       setListeners()
    }
    fun setListeners(){
        binding.requestButton.setOnClickListener {
            binding.txt1.text = "change is good"
        }
    }
}