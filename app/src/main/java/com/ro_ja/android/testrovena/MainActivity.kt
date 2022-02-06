package com.ro_ja.android.testrovena


import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var imageView: ImageView
    private lateinit var button1: ImageButton
    private lateinit var button2: ImageButton
    private lateinit var button3: ImageButton
    private lateinit var button4: ImageButton
    private lateinit var button5: ImageButton
    private lateinit var button6: ImageButton
    private lateinit var buttonRight: ImageButton
    private lateinit var buttonLeft: ImageButton
    private var numberButton = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView = findViewById(R.id.image_view)
        buttonLeft = findViewById(R.id.button_back)
        buttonRight = findViewById(R.id.button_next)
        button1 = findViewById(R.id.image_button_1)
        button2 = findViewById(R.id.image_button_2)
        button3 = findViewById(R.id.image_button_3)
        button4 = findViewById(R.id.image_button_4)
        button5 = findViewById(R.id.image_button_5)
        button6 = findViewById(R.id.image_button_6)

        button1.setOnClickListener {
            numberButton = 1
            Toast.makeText(this, R.string.toast_incorrect, Toast.LENGTH_SHORT).show()
        }
        button2.setOnClickListener {
            numberButton = 2
            Toast.makeText(this, R.string.toast_incorrect, Toast.LENGTH_SHORT).show()
        }
        button3.setOnClickListener {
            numberButton = 3
            Toast.makeText(this, R.string.toast_incorrect, Toast.LENGTH_SHORT).show()
        }
        button4.setOnClickListener {
            numberButton = 4
            Toast.makeText(this, R.string.toast_correct, Toast.LENGTH_SHORT).show()
        }
        button5.setOnClickListener {
            numberButton = 5
            Toast.makeText(this, R.string.toast_incorrect, Toast.LENGTH_SHORT).show()
        }
        button6.setOnClickListener {
            numberButton = 6
            Toast.makeText(this, R.string.toast_incorrect, Toast.LENGTH_SHORT).show()
        }
    }
}