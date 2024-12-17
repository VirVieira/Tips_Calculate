package com.example.tip

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tip.databinding.ActivityMainBinding
import com.example.tips_calculate.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    // Valor Total da Conta
    // Numero de Pessoas
    //Porcentagem de Gorjeta
    // 10%, 15%, ou 20%
    // Calcular
    // Limpar
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(root = binding.root)

        val total: Float = binding.tieTotal.text.toString().toFloat()
        val npeople: Float = binding.tieNumPeople.text.toString().toFloat()

        binding.rbOptionOne.setOnCheckedChangeListener { _, isChecked ->
            println("Virginia Option one: $isChecked")
        }
        binding.rbOptionTwo.setOnCheckedChangeListener { _, isChecked ->
            println("Virginia Option two: $isChecked")
        }
        binding.rbRboptionThree.setOnCheckedChangeListener { _, isChecked ->
            println("Virginia Option Three: $isChecked")
        }

        //Recuperar as Views do Layout
        //ViewBinding
        //camel case
        // Recuperar os Radio Button

        binding.btnClean.setOnClickListener {
            println("Virginia1" + binding.tieTotal.text)
            println("Virginia1" + binding.tieNumPeople.text)

        }
    }

    private fun setContentView(root: no_name_in_PSI_3d19d79d_1ba9_4cd0_b7f5_b46aa3cd5d40) {

    }
}
