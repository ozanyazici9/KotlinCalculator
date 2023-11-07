package com.ozanyazici.kotlincalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import com.ozanyazici.kotlincalculator.databinding.ActivityMainBinding

import android.view.View

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    var number1 : Double? = null
    var number2 : Double? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }


    fun plus (view : View) {
         atama()

        if(number1 != null && number2 != null) {
            binding.textView.text = "Result : ${number1!!+ number2!!}"
        } else {
            binding.textView.text = "Please enter numbers correctly"
        }

    }

    fun minus (view : View) {
        atama()

        if(number1 != null && number2 != null) {
            binding.textView.text = "Result : ${number1!! - number2!!}"
        } else {
            binding.textView.text = "Please enter numbers correctly"
        }

    }

    fun multiply (view : View) {
       atama()

        if(number1 != null && number2 != null) {
            binding.textView.text = "Result : ${number1!! * number2!!}"
        } else {
            binding.textView.text = "Please enter numbers correctly"
        }
    }

    fun divide (view : View) {
       atama()

        if(number1 != null && number2 != null) {
            binding.textView.text = "Result : ${number1!! / number2!!}"
        } else {
            binding.textView.text = "Please enter numbers correctly"
        }
    }

    fun atama () {
        number1 = binding.number1Text.text.toString().toDoubleOrNull()
        number2 = binding.number2Text.text.toString().toDoubleOrNull()
    }
}