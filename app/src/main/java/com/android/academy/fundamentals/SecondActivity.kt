package com.android.academy.fundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val transmittedString = intent.getStringExtra(TRANSMITTED_STRING)
        val transmittedInt = intent.getIntExtra(TRANSMITTED_INT, 0)
        val transmittedBoolean = intent.getBooleanExtra(TRANSMITTED_BOOLEAN, true)

        val textView = findViewById<TextView>(R.id.second_activity_text_view)
        textView.text = "String: $transmittedString, Int: $transmittedInt, Boolean: $transmittedBoolean"
    }

    companion object {
        const val TRANSMITTED_STRING = "transmittedString"
        const val TRANSMITTED_INT = "transmittedInt"
        const val TRANSMITTED_BOOLEAN = "transmittedBoolean"
    }
}