package com.example.cyberdonateapp

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.activity.ComponentActivity
import android.widget.Button
import android.content.Intent
import android.net.Uri



class HonkaiStarRailActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_honkai_star_rail)

        val diamondSpinner = findViewById<Spinner>(R.id.HsrSpinner)
        val items = listOf("60 \uD83D\uDCA0", "330 \uD83D\uDCA0", "1090 \uD83D\uDCA0", "2240 \uD83D\uDCA0", "3880 \uD83D\uDCA0", "8080 \uD83D\uDCA0")
        val adapter = ArrayAdapter(this, R.layout.spinner_item_white, items)
        adapter.setDropDownViewResource(R.layout.spinner_dropdown_item_white)
        diamondSpinner.adapter = adapter

        val orderButton = findViewById<Button>(R.id.topUpButton)
        orderButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/Cyber_DonateBot"))
            startActivity(intent)
        }
    }
}