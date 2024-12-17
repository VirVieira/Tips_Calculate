package com.example.tips_calculate

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tips_calculate.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var percentage: Int = 0
        binding.rbOptionOne.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                percentage = 10
            }
        }
        binding.rbOptionTwo.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                percentage = 15
            }

            binding.rbRboptionThree.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) {
                    percentage = 20
                }
            }

            binding.btnDone.setOnClickListener {
                val totalTableTemp = binding.tieTotal.text
                val nPeopleTemp = binding.tieNumPeople.text

                if (totalTableTemp!!.isEmpty() == true || nPeopleTemp!!.isEmpty() == true) {
                    Snackbar.make(binding.tieTotal, "Preencha todos os Campos", Snackbar.LENGTH_LONG)
                        .show()

                } else {

                }

                val totalTable: Float = totalTableTemp.toString().toFloat()
                val npeople: Int = nPeopleTemp.toString().toInt()

                val totalTemp = totalTable / npeople
                val tips = totalTemp * percentage / 100
                val totalWithTips = totalTemp + tips
                binding.tvResult.text = "Total with tips: $totalWithTips"
            }


            binding.btnClean.setOnClickListener {
                binding.tvResult.text = ""
                binding.tieTotal.setText("")
                binding.tieNumPeople.setText("")
                binding.rbOptionOne.isChecked = false
                binding.rbOptionTwo.isChecked = false
                binding.rbRboptionThree.isChecked = false

            }
        }
    }
}
