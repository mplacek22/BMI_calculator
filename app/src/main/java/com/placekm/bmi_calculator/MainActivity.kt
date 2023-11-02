package com.placekm.bmi_calculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calculator = BMICalculatorMetric()

        val heightEditText = findViewById<EditText>(R.id.height_edit_text)
        val weightEditText = findViewById<EditText>(R.id.weight_edit_text)
        val button = findViewById<Button>(R.id.compute_bmi_button)
        button.setOnClickListener{

            val textView = findViewById<TextView>(R.id.bmi_text_view)
            val height = heightEditText.text.toString().toDouble()
            val weight = weightEditText.text.toString().toDouble()
            textView.text = String.format("%.1f", calculator.calculate(height, weight))
        }
    }
}