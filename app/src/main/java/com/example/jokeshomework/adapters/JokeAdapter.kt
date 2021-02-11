package com.example.jokeshomework.adapters

import android.graphics.Color
import android.renderscript.ScriptGroup
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.jokeshomework.R
import com.example.jokeshomework.model.Joke

class JokeAdapter(val jokes: List<Joke>) : RecyclerView.Adapter<JokeAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView

        init {
            textView = view.findViewById(R.id.joke_txt)
            textView.textSize = 30.0F
            textView.setBackgroundColor(Color.GRAY)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.rv_joke_item,
            parent,
            false
        )
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if(jokes[position].joke == null){
            holder.textView.text = jokes[position].setup
        }else {
            holder.textView.text = jokes[position].joke
        }
    }

    override fun getItemCount(): Int {
        return jokes.size
    }
}