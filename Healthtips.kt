package com.example.bmicalculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Healthtips : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_healthtips)

        supportActionBar?.hide()

      val tips= findViewById<EditText>(R.id.ehtips)
        val under= findViewById<TextView>(R.id.eunder)
        val undertips= findViewById<EditText>(R.id.eTundertips)
        val normal= findViewById<TextView>(R.id.enormal)
        val normaltips= findViewById<EditText>(R.id.eTnormaltips)
        val over= findViewById<TextView>(R.id.eoverweight)
        val overtips= findViewById<EditText>(R.id.eTovertips)
    }
}