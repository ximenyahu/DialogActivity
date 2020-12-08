package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDialogActivity_1.setOnClickListener {
            val intent = Intent(this, FirstDialogActivity::class.java)
            startActivity(intent)
        }

        btnDialogActivity_2.setOnClickListener {
            val intent = Intent(this, SecondDialogActivity::class.java)
            startActivity(intent)
        }
    }
}