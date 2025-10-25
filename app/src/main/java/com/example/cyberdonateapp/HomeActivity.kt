package com.example.cyberdonateapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val gameButton1 = findViewById<Button>(R.id.MobileLegendsButton)
        val gameButton2 = findViewById<Button>(R.id.PubgMobileButton)
        val gameButton3 = findViewById<Button>(R.id.GenshinImpactButton)
        val gameButton4 = findViewById<Button>(R.id.HonkaiStarRailButton)

        gameButton1.setOnClickListener {
            val intent = Intent(this, MobileLegendsActivity::class.java)
            startActivity(intent)
        }

        gameButton2.setOnClickListener {
            val intent = Intent(this, PubgMobileActivity::class.java)
            startActivity(intent)
        }

        gameButton3.setOnClickListener {
            val intent = Intent(this, GenshinImpactActivity::class.java)
            startActivity(intent)
        }

        gameButton4.setOnClickListener {
            val intent = Intent(this, HonkaiStarRailActivity::class.java)
            startActivity(intent)
        }
    }
}
