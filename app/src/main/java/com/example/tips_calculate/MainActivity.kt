package com.example.tips_calculate

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
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
            val adapater = ArrayAdapter.createFromResource(
                this,
                R.array.num_people,
                android.R.layout.simple_spinner_item
            )

            adapater.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            binding.spinnerNumberOfPeople.adapter = adapater

            var numOfPeopleSelected = 0

            binding.spinnerNumberOfPeople.onItemSelectedListener =
                object  : AdapterView.OnItemSelectedListener {

                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    TODO("Not yet implemented")
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {

                }
            }

            binding.btnDone.setOnClickListener {
                val totalTableTemp = binding.tieTotal.text


                if (totalTableTemp!!.isEmpty() == true ) {
                    Snackbar.make(binding.tieTotal, "Preencha todos os Campos", Snackbar.LENGTH_LONG)
                        .show()

                } else {

                }

                val totalTable: Float = totalTableTemp.toString().toFloat()
                val npeople: Int = numOfPeopleSelected

                val totalTemp = totalTable / npeople
                val tips = totalTemp * percentage / 100
                val totalWithTips = totalTemp + tips
                binding.tvResult.text = "Total with tips: $totalWithTips"
            }


            binding.btnClean.setOnClickListener {
                binding.tvResult.text = ""
                binding.tieTotal.setText("")
                binding.rbOptionOne.isChecked = false
                binding.rbOptionTwo.isChecked = false
                binding.rbRboptionThree.isChecked = false

            }
        }
    }
}
