package com.muqui.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //referencia al boton
        val btn_saludar = findViewById(R.id.btn_saludo) as Button;
        //referencia al textview
        val txt_saludo = findViewById(R.id.txt_saludo) as TextView

       btn_saludar.setOnClickListener {
           txt_saludo.setText("Hola mundo");
       }

    }
}