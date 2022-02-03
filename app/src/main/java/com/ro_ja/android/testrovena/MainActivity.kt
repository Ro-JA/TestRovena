package com.ro_ja.android.testrovena

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private lateinit var imageView: ImageView
    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button
    private lateinit var button5: Button
    private lateinit var button6: Button
    private lateinit var buttonRight: Button
    private lateinit var buttonLeft: Button
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
        }
    }
}