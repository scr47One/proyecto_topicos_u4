package com.example.proyectofinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_estuche3.*

class Estuche3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estuche3)

        boton1.setOnClickListener {
            val intent: Intent = Intent(this, Catalogo::class.java)
            startActivity(intent)
        }


    }
}