package com.example.cyberdonateapp

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.activity.ComponentActivity
import android.widget.Button
import android.content.Intent
import android.net.Uri



class GenshinImpactActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_genshin_impact)

        val diamondSpinner = findViewById<Spinner>(R.id.GiSpinner)
        val items = listOf("60 \uD83E\uDDFF", "330 \uD83E\uDDFF", "1090 \uD83E\uDDFF", "2240 \uD83E\uDDFF", "3880 \uD83E\uDDFF", "8080 \uD83E\uDDFF")
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