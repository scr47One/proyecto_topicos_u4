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
            val intent: Intent = Intent(this, muneca1::class.java)
            startActivity(intent)
            finish()
        }

        boton2.setOnClickListener {
            val intent: Intent = Intent(this, muneca2::class.java)
            startActivity(intent)
            finish()
        }

        boton3.setOnClickListener {
            val intent: Intent = Intent(this, Muneca3::class.java)
            startActivity(intent)
            finish()
        }

        boton4.setOnClickListener {
            val intent: Intent = Intent(this, muneca4::class.java)
            startActivity(intent)
            finish()
        }

        boton5.setOnClickListener {
            val intent: Intent = Intent(this, muneca5::class.java)
            startActivity(intent)
            finish()
        }

        boton6.setOnClickListener {
            val intent: Intent = Intent(this, muneca6::class.java)
            startActivity(intent)
            finish()
        }

        boton7.setOnClickListener {
            val intent: Intent = Intent(this, muneca7::class.java)
            startActivity(intent)
            finish()
        }

        boton8.setOnClickListener {
            val intent: Intent = Intent(this, muneca8::class.java)
            startActivity(intent)
            finish()
        }

        boton9.setOnClickListener {
            val intent: Intent = Intent(this, muneca9::class.java)
            startActivity(intent)
            finish()
        }
    }
}