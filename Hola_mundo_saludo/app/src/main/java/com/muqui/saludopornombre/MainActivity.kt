package com.muqui.saludopornombre

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // get reference to editText
        val editTextNombre = findViewById(R.id.editTxtNombre) as EditText
        // get reference to Button
        val btnSaludo = findViewById(R.id.btn_saludo) as Button
        // get reference to textView
        val txtSaludo = findViewById(R.id.txt_saludo) as TextView

        btnSaludo.setOnClickListener {
            val nombre = editTextNombre.text.toString()
            txtSaludo.setText("Hola " + nombre + " un placer conocerle!!!")
            Toast.makeText(this@MainActivity, "Hola " + nombre + " un placer conocerle!!!", Toast.LENGTH_LONG).show()
        }
    }
}