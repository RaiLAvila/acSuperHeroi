
package com.example.acsuperheroi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class heroi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.heroi)

        val button5 = findViewById<Button>(R.id.button4)
        val btnCompartilhar = findViewById<Button>(R.id.btnCompartilhar2)

        // Botão que volta para a MainActivity
        button5.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        // Botão que compartilha o resultado
        btnCompartilhar.setOnClickListener {
            val resultadoQuiz = "Eu sou um heroi"

            val intent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT, resultadoQuiz)
            }

            val chooser = Intent.createChooser(intent, "Compartilhar resultado com...")
            startActivity(chooser)
        }
    }
}
