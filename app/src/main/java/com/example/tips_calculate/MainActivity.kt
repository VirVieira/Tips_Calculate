package com.example.tip

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.tips_calculate.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

   private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

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


        binding.btnClean.setOnClickListener {
            println("Virginia1" + binding.tieTotal.text)
            println("Virginia1" + binding.tieNumPeople.text)

        }
    }

}
