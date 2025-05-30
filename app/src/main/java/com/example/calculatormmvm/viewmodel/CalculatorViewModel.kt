package com.example.calculatormmvm.viewmodel

import androidx.lifecycle.ViewModel
import com.example.calculatormmvm.model.CalculatorData

class CalculatorViewModel:ViewModel() {

    fun calculateSum (num1: Int, num2: Int): CalculatorData{ //returns data class
        val sum = num1 + num2
        return CalculatorData(num1, num2, sum) //this is a constructor
    }

}