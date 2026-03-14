package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class CalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        val number1 = findViewById<EditText>(R.id.number1)
        val number2 = findViewById<EditText>(R.id.number2)

        val add = findViewById<RadioButton>(R.id.add)
        val sub = findViewById<RadioButton>(R.id.sub)
        val mul = findViewById<RadioButton>(R.id.mul)
        val div = findViewById<RadioButton>(R.id.div)

        val button = findViewById<Button>(R.id.calcButton)
        val resultText = findViewById<TextView>(R.id.resultText)

        button.setOnClickListener {

            val num1 = number1.text.toString()
            val num2 = number2.text.toString()

            if (num1.isEmpty() || num2.isEmpty()) {

                resultText.text = "Введите оба числа"

            } else {

                val a = num1.toDouble()
                val b = num2.toDouble()

                var result = 0.0

                if (add.isChecked) {
                    result = a + b
                }
                else if (sub.isChecked) {
                    result = a - b
                }
                else if (mul.isChecked) {
                    result = a * b
                }
                else if (div.isChecked) {
                    result = a / b
                }

                resultText.text = "Result: $result"

            }
        }
    }
}