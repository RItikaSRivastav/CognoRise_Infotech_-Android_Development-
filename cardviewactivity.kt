package com.example.bmicalculator

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class cardviewactivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cardviewactivity)

        supportActionBar?.hide()

        val bmi= findViewById<ImageView>(R.id.imgBMI)
        val tips= findViewById<ImageView>(R.id.eTips)
        val btntips= findViewById<Button>(R.id.btntips)
        val btn= findViewById<Button>(R.id.btnCalculate)

        btn.setOnClickListener{
            val i= Intent(this, BMIactivity::class.java)
            startActivity(i)
        }

       btntips.setOnClickListener {
           val i2= Intent(this, Healthtips::class.java)
           startActivity(i2)
       }
    }
}