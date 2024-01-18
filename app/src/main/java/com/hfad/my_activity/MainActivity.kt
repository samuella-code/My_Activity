package com.hfad.my_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.util.Log

class MainActivity : AppCompatActivity() {

    private lateinit var stateTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Lifecycle", "onCreate")

        stateTextView = findViewById(R.id.stateTextView)
        updateStateTextView("onCreate")

        val startButton: Button = findViewById(R.id.startButton)
        val pauseButton: Button = findViewById(R.id.pauseButton)
        val stopButton: Button = findViewById(R.id.stopButton)

        startButton.setOnClickListener {
            updateStateTextView("onCreate, onStart, onResume")
        }

        pauseButton.setOnClickListener {
            updateStateTextView("onPause")
        }

        stopButton.setOnClickListener {
            updateStateTextView("onStop")
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Lifecycle", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle", "onStop")
    }

    private fun updateStateTextView(newState: String) {
        stateTextView.text = "Current State: $newState"
    }
}
