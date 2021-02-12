package com.example.jokeshomework.adapters

import android.content.ContentValues.TAG
import android.graphics.Color
import android.renderscript.ScriptGroup
import android.text.Layout
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.jokeshomework.R
import com.example.jokeshomework.model.Joke

class JokeAdapter(val jokes: List<Joke>) : RecyclerView.Adapter<JokeAdapter.ViewHolder>() {
    private  val TAG = "JokeAdapter"
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView
        val answerView: TextView
        val checkBox: CheckBox
        init {
            checkBox = view.findViewById(R.id.save_joke_cb)
                checkBox.setOnClickListener(View.OnClickListener {
                    Log.d(TAG, "clicked: ")
                })
            answerView = view.findViewById(R.id.joke_answer_tv)
                answerView.textSize = 15F
            textView = view.findViewById(R.id.joke_txt)
                textView.textSize = 15.0F
                textView.setBackgroundColor(Color.GRAY)
                textView.setOnLongClickListener(View.OnLongClickListener {
                    answerView.visibility =View.VISIBLE
                    true
                })



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
            holder.answerView.text = jokes[position].delivery
        }else {
            holder.textView.text = jokes[position].joke
            holder.answerView.text = "sorry thats the whole thing"
        }
    }

    override fun getItemCount(): Int {
        return jokes.size
    }
}


