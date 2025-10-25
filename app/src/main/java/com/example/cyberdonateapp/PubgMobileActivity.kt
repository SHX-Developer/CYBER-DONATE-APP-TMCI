package com.example.cyberdonateapp

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.activity.ComponentActivity
import android.widget.Button
import android.content.Intent
import android.net.Uri

class PubgMobileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pubg_mobile)

        val diamondSpinner = findViewById<Spinner>(R.id.PubgSpinner)
        val items = listOf("60 \uD83D\uDCB8", "325 \uD83D\uDCB8", "660 \uD83D\uDCB8", "1800 \uD83D\uDCB8", "2460 \uD83D\uDCB8", "3850 \uD83D\uDCB8")
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