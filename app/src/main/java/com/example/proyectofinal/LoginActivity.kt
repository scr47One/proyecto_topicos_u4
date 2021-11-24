package com.example.proyectofinal

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.inicio_sesion

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        inicio_sesion.setOnClickListener {

            if(TextUtils.isEmpty(correoEditText.text.toString())||TextUtils.isEmpty(contrasenaEditText.text.toString())){
                Toast.makeText(this,"Llene todos los campos",Toast.LENGTH_LONG)

            }else{
                val intent: Intent = Intent(this, catalogo::class.java)
                startActivity(intent)
                finish()
            }

        }
        cancelar.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}

