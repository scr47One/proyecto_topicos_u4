package com.example.proyectofinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_catalogo.*

class Catalogo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalogo)

        salir.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        boton1.setOnClickListener {
            val intent: Intent = Intent(this, esteche::class.java)
            startActivity(intent)
            finish()
        }

        boton2.setOnClickListener {
            val intent: Intent = Intent(this, Estuchera2::class.java)
            startActivity(intent)
            finish()
        }

        boton3.setOnClickListener {
            val intent: Intent = Intent(this, Estuche3::class.java)
            startActivity(intent)
            finish()
        }

        boton4.setOnClickListener {
            val intent: Intent = Intent(this, estuche4::class.java)
            startActivity(intent)
            finish()
        }

        boton5.setOnClickListener {
            val intent: Intent = Intent(this, estuche5::class.java)
            startActivity(intent)
            finish()
        }

        boton6.setOnClickListener {
            val intent: Intent = Intent(this, estuche6::class.java)
            startActivity(intent)
            finish()
        }

        boton7.setOnClickListener {
            val intent: Intent = Intent(this, estucje7::class.java)
            startActivity(intent)
            finish()
        }

        boton8.setOnClickListener {
            val intent: Intent = Intent(this, estuche8::class.java)
            startActivity(intent)
            finish()
        }

        boton9.setOnClickListener {
            val intent: Intent = Intent(this, estuche9::class.java)
            startActivity(intent)
            finish()
        }
    }
}