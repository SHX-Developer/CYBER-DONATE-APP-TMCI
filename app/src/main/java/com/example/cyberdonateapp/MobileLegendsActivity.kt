package com.example.cyberdonateapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.Spinner
import android.widget.ArrayAdapter
import android.widget.Button
import android.content.Intent
import android.net.Uri



class MobileLegendsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mobile_legends)

        val diamondSpinner = findViewById<Spinner>(R.id.MlSpinner)
        val items = listOf("86 💎", "172 💎", "257 💎", "344 💎", "429 💎", "514 💎")
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
