package com.example.calculatormmvm.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.example.calculatormmvm.R
import com.example.calculatormmvm.databinding.ActivityMainBinding
import com.example.calculatormmvm.viewmodel.CalculatorViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var calculatorViewModel: CalculatorViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        calculatorViewModel = ViewModelProvider(this).get(CalculatorViewModel::class.java)

        binding.addButton.setOnClickListener {
            val num1 = binding.numberone.text.toString().toIntOrNull()?:0
            val num2 = binding.numbertwo.text.toString().toIntOrNull()?:0

            val result = calculatorViewModel.calculateSum(num1, num2)

            binding.finalValue.text = "${result.sum}"
        }
    }
}