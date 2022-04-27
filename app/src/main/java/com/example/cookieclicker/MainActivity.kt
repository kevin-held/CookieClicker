package com.example.cookieclicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

private var currentScore = 0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgCookie: ImageView = findViewById(R.id.imgCookie)
        val lblTotal: TextView = findViewById(R.id.lblTotal)
        val button: Button = findViewById(R.id.button)
        val editText: EditText = findViewById(R.id.editText)

        imgCookie.setOnClickListener {
            currentScore ++
            lblTotal.text = "$currentScore"
        }

        button.setOnClickListener {
            var name = editText.text ?: ""
            Toast.makeText(this, "Score Submitted: $name - $currentScore", Toast.LENGTH_LONG).show()
            currentScore = 0
            lblTotal.text = "$currentScore"
            editText.text.clear()
        }


    }
}