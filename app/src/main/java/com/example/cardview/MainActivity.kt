package com.example.cardview

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Recogemos el usuario enviado desde LoginActivity (con un valor por defecto por seguridad)
        val usuarioIngresado = intent.getStringExtra("USER_KEY") ?: "Administrador"

        // Localizamos el TextView de bienvenida en tu layout activity_main.xml
        val textBienvenida = findViewById<TextView>(R.id.text_bienvenida)

        // Mostramos el mensaje personalizado en pantalla
        textBienvenida.text = "¡Bienvenido, $usuarioIngresado!"
    }
}