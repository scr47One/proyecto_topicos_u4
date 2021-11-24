package com.example.proyectofinal

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.proyectofinal.databinding.ActivityLoginBinding
import kotlinx.android.synthetic.main.activity_login.*

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.inicio_sesion

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        inicio_sesion.setOnClickListener {
            if(TextUtils.isEmpty(correoEditText.text.toString())||TextUtils.isEmpty(contrasenaEditText.text.toString())){
                Toast.makeText(this,"Llene todos los campos",Toast.LENGTH_LONG)

            }else{
                val intent: Intent = Intent(this, catalogo::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}

