package com.muqui.suma2numeros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get references
        val editTextNumber = findViewById(R.id.editTextNumber) as EditText
        val editTextNumber2 = findViewById(R.id.editTextNumber2) as EditText
        val txtResultado = findViewById(R.id.txtResultado) as TextView
        val btnSumar = findViewById(R.id.btnSumar) as Button
        btnSumar.setOnClickListener {
            val sumando_1: Int = editTextNumber.text.toString().toInt()
            val sumando_2: Int = editTextNumber2.text.toString().toInt()
            val resultado : Int = sumando_1 + sumando_2
            txtResultado.setText(resultado)
        }
    }
}