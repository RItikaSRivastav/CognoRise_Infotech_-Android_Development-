package com.example.bmicalculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Locale.Category

class BMIactivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bmi)

        val bmi = findViewById<TextView>(R.id.texbmi)
        val des = findViewById<EditText>(R.id.edescription)
        val Height = findViewById<EditText>(R.id.eTHeight)
        val Weight = findViewById<EditText>(R.id.edWeight)
        val btn = findViewById<Button>(R.id.btnPress)
        val Result = findViewById<TextView>(R.id.tVResult)


        btn.setOnClickListener {

            val h = (Height.text.toString()).toFloat() / 100
            val w = (Weight.text.toString()).toFloat()


            val r = w / (h * h)
            Result.text = "BMI is $r "
        }

            }
        }


        








