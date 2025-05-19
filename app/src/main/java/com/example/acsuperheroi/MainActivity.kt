package com.example.acsuperheroi

import android.content.Intent
import android.os.Bundle
import android.text.method.TextKeyListener
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.button7)

        button1.setOnClickListener {
            val intent = Intent(this, TelaPerguntas::class.java)
            startActivity(intent)
        }


        }
    }
