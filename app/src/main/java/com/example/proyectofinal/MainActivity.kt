package com.example.proyectofinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        catalogo.setOnClickListener {
            val intent: Intent = Intent(this, Catalogo::class.java)
            startActivity(intent)
            finish()
        }

        registro.setOnClickListener {
            val intent: Intent = Intent(this, Registro::class.java)
            startActivity(intent)
            finish()
        }

        inicio_sesion.setOnClickListener {
            val intent: Intent = Intent(this, inicio_sesion::class.java)
            startActivity(intent)
            finish()
        }
        contacto.setOnClickListener {
            val intent: Intent = Intent(this, contacto::class.java)
            startActivity(intent)
            finish()
        }


    }
}