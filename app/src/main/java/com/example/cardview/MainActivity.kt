package com.example.proyectologin

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.cardview.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textBienvenida = findViewById<TextView>(R.id.text_bienvenida)

        val usuario = intent.getStringExtra("USER_KEY")
        if (!usuario.isNullOrEmpty()) {
            textBienvenida.text = "Bienvenido, $usuario"
        }
    }
}