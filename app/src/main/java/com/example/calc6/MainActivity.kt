package com.example.calc6

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import net.objecthunter.exp4j.ExpressionBuilder
import java.util.Stack

class MainActivity : AppCompatActivity() {
    private lateinit var calculateButton: Button

    private lateinit var num1: EditText

    private lateinit var add: Button
    private lateinit var sub: Button
    private lateinit var mul: Button
    private lateinit var div: Button

    private var operator = ""

    private lateinit var one: Button
    private lateinit var two: Button
    private lateinit var three: Button
    private lateinit var four: Button
    private lateinit var five: Button
    private lateinit var six: Button
    private lateinit var seven: Button
    private lateinit var eight: Button
    private lateinit var nine: Button
    private lateinit var zero: Button
    private lateinit var decimal: Button
    private lateinit var sqrt: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        calculateButton = findViewById(R.id.calculateButton)
        num1 = findViewById(R.id.num1)

        add = findViewById(R.id.add)
        sub = findViewById(R.id.sub)
        mul = findViewById(R.id.mul)
        div = findViewById(R.id.div)

        one =  findViewById(R.id.one)
        two =  findViewById(R.id.two)
        three =  findViewById(R.id.three)
        four = findViewById(R.id.four)
        five =  findViewById(R.id.five)
        six =  findViewById(R.id.six)
        seven =  findViewById(R.id.seven)
        eight =  findViewById(R.id.eight)
        nine =  findViewById(R.id.nine)
        zero =  findViewById(R.id.zero)
        decimal =  findViewById(R.id.decimal)
        sqrt =  findViewById(R.id.sqrt)



// Wire up each button to set calculator operation
        add.setOnClickListener {
            var newText = num1.text.toString() + "+"
            num1.setText(newText.toString())
        }
        sub.setOnClickListener {
            var newText = num1.text.toString() + "-"
            num1.setText(newText.toString())
        }
        mul.setOnClickListener {
            var newText = num1.text.toString() + "*"
            num1.setText(newText.toString())
        }
        div.setOnClickListener {
            var newText = num1.text.toString() + "/"
            num1.setText(newText.toString())
        }

        one.setOnClickListener {
            var newText = num1.text.toString() + "1"
            num1.setText(newText.toString())
        }

        two.setOnClickListener {
            var newText = num1.text.toString() + "2"
            num1.setText(newText.toString())
        }

        three.setOnClickListener {
            var newText = num1.text.toString() + "3"
            num1.setText(newText.toString())
        }

        four.setOnClickListener {
            var newText = num1.text.toString() + "4"
            num1.setText(newText.toString())
        }

        five.setOnClickListener {
            var newText = num1.text.toString() + "5"
            num1.setText(newText.toString())
        }

        six.setOnClickListener {
            var newText = num1.text.toString() + "6"
            num1.setText(newText.toString())
        }

        seven.setOnClickListener {
            var newText = num1.text.toString() + "7"
            num1.setText(newText.toString())
        }

        eight.setOnClickListener {
            var newText = num1.text.toString() + "8"
            num1.setText(newText.toString())
        }

        nine.setOnClickListener {
            var newText = num1.text.toString() + "9"
            num1.setText(newText.toString())
        }

        zero.setOnClickListener {
            var newText = num1.text.toString() + "0"
            num1.setText(newText.toString())
        }

        decimal.setOnClickListener {
            var newText = num1.text.toString() + "."
            num1.setText(newText.toString())
            }

        sqrt.setOnClickListener {
            var newText = num1.text.toString() + "sqrt"
            num1.setText(newText.toString())
        }

        calculateButton.setOnClickListener{
            try {
                var result = ExpressionBuilder(num1.text.toString())
                    .build()
                    .evaluate()
                num1.setText(result.toString())
            } catch (e: Exception) {
                Toast.makeText(this, "Error, illegal expression.", Toast.LENGTH_LONG).show()
            }

        }
        }






    }
