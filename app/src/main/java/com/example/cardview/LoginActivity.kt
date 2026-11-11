package com.example.cardview

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    private val MYUSER = "admin"
    private val MYPASS = "1234"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val editUsuario = findViewById<EditText>(R.id.edit_usuario)
        val editPass = findViewById<EditText>(R.id.edit_pass)
        val btnValidar = findViewById<Button>(R.id.button_validar)

        btnValidar.setOnClickListener {
            val usuarioIngresado = editUsuario.text.toString()
            val passIngresado = editPass.text.toString()

            if (usuarioIngresado == MYUSER && passIngresado == MYPASS) {
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("USER_KEY", usuarioIngresado)
                }
                startActivity(intent)
            } else {
                Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}