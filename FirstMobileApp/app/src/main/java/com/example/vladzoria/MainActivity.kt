package com.example.vladzoria

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView1)

    }

    fun onMyButtonClick(view: View?) {
        val randomNumber = Random.nextInt(from = 1, until = 100)
        textView.setText(String.format("%d", randomNumber))
    }
}