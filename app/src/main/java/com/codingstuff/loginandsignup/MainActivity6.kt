package com.codingstuff.loginandsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        val ring = findViewById<ImageView>(R.id.ring)
        ring.setOnClickListener {
            val intent = Intent(this, product_description::class.java)
            startActivity(intent)

            val dress = findViewById<ImageView>(R.id.dress)
            dress.setOnClickListener {
                val intent = Intent(this, product_description::class.java)
                startActivity(intent)


                val button2 = findViewById<Button>(R.id.button2)
                button2.setOnClickListener {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)

                }
            }
        }
    }
}