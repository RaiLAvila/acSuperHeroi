package com.example.acsuperheroi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class TelaPerguntas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.segundatela)
        val button1 = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)

        button1.setOnClickListener {
            val intent = Intent(this, heroi::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this, vilao::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(this, antiheroi::class.java)
            startActivity(intent)
        }
        }
    }
