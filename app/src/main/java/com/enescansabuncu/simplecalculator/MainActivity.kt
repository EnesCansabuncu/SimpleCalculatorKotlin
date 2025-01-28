package com.enescansabuncu.simplecalculator

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.enescansabuncu.simplecalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var number1:Double?=null
    var number2:Double?=null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)






        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


    }

    fun sum(view:View){
        number1=binding.number1Text.text.toString().toDoubleOrNull()

        number2=binding.number2Text.text.toString().toDoubleOrNull()
        if (number1!=null&&number2!=null){
            val res=number1!!+ number2!!
            binding.resultText.text="Result:${res}"
        }
        else{
            binding.resultText.text="Error enter number"
        }
    }
    fun sub(view:View){
        number1=binding.number1Text.text.toString().toDoubleOrNull()

        number2=binding.number2Text.text.toString().toDoubleOrNull()
        if (number1!=null&&number2!=null){
            val res=number1!!- number2!!
            binding.resultText.text="Result:${res}"
        }
        else{
            binding.resultText.text="Error enter number"
        }
    }
    fun multiply(view:View){
        number1=binding.number1Text.text.toString().toDoubleOrNull()

        number2=binding.number2Text.text.toString().toDoubleOrNull()
        if (number1!=null&&number2!=null){
            val res=number1!!* number2!!
            binding.resultText.text="Result:${res}"
        }
        else{
            binding.resultText.text="Error enter number"
        }
    }
    fun div(view:View){
        number1=binding.number1Text.text.toString().toDoubleOrNull()

        number2=binding.number2Text.text.toString().toDoubleOrNull()
        if (number1!=0.0&&number2!=0.0){
            if (number1!=null&&number2!=null){
                val res=number1!!/ number2!!
                binding.resultText.text="Result:${res}"
            }
            else{
                binding.resultText.text="Error enter number"
            }
        }
        else{
            binding.resultText.text="0 is not entered"
        }

    }
    }

