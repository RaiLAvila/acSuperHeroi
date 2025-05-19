package com.example.acsuperheroi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class antiheroi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.antiheroi)

        val button5 = findViewById<Button>(R.id.button6)
        val btnCompartilhar = findViewById<Button>(R.id.btnCompartilhar3)

        // Botão que volta para a MainActivity
        button5.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        // Botão que compartilha o resultado
        btnCompartilhar.setOnClickListener {
            val resultadoQuiz = "Eu sou um antiheroi"

            val intent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT, resultadoQuiz)
            }

            val chooser = Intent.createChooser(intent, "Compartilhar resultado com...")
            startActivity(chooser)
        }
    }
}
