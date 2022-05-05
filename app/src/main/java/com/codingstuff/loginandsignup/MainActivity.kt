package com.codingstuff.loginandsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val activity2 = findViewById<LinearLayout>(R.id.activity2)
        activity2.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)

            val activity3 = findViewById<LinearLayout>(R.id.activity3)
            activity3.setOnClickListener {
                val intent = Intent(this, MainActivity3::class.java)
                startActivity(intent)

                val activity4 = findViewById<LinearLayout>(R.id.activity4)
                activity4.setOnClickListener {
                    val intent = Intent(this, MainActivity4::class.java)
                    startActivity(intent)


                }
            }
        }
    }
}
