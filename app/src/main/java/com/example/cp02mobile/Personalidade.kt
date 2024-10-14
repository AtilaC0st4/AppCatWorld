package com.example.cp02mobile

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class Personalidade : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_personalidade)

val btnCadastro = findViewById<Button>(R.id.btnCadastro)
val btnPersonalidade = findViewById<Button>(R.id.btnPersonalidade)


        btnCadastro.setOnClickListener{
            supportFragmentManager.beginTransaction()
                .replace(R.id.main,Cadastro())
                .commit()

        }
            btnPersonalidade.setOnClickListener{
            supportFragmentManager.beginTransaction()
                .replace(R.id.main,FragmentPersonalidade())
                .commit()

        }


        val btnVoltar = findViewById<Button>(R.id.btnVoltar)

        btnVoltar.setOnClickListener{
            finish()
        }
    }
}