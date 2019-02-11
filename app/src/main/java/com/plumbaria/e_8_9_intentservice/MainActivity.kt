package com.plumbaria.e_8_9_intentservice

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var Salida : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Salida = findViewById(R.id.salida)
    }

    fun calcularOperacion(view: View){
        var n : Double = entrada.getText().toString().toDouble()
        Salida = findViewById(R.id.salida)
        Salida.append(""+n +"^2 = ")
        var i : Intent = Intent(this, IntentServiceOperacion::class.java)
        i.putExtra("numero", n)
        startService(i)
    }
}

