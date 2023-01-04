package com.example.semana11_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.semana11_login.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var k: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        k = ActivityMainBinding.inflate(layoutInflater)
        setContentView(k.root)

        k.btnSubmit.setOnClickListener(View.OnClickListener {
            if(k.etPassword.text.toString() == "123" && k.etUserName.text.toString() == "luiza") {
                startActivity(Intent(this, Home::class.java))
                val sucesso = Toast.makeText(this, "Sucesso no login!", Toast.LENGTH_SHORT).show()
            } else {
                val falha = Toast.makeText(this, "Usuário ou senha incorretos!", Toast.LENGTH_SHORT).show()
            }
        })
        k.btnReset.setOnClickListener(View.OnClickListener {
            k.etPassword.setText("")
            k.etUserName.setText("")
        })
    }
}