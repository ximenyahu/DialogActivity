package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class FirstDialogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        val display = windowManager.defaultDisplay
        val p = window.attributes
        p.width = (display.width * 0.7).toInt()
        p.height = (display.height * 0.7).toInt()
        window.attributes = p
    }
}