package com.codingstuff.loginandsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout

class List_users : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_list)



        val person = findViewById<ImageView>(R.id.person)
        person.setOnClickListener {
            val intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)

            val person1 = findViewById<ImageView>(R.id.person1)
            person1.setOnClickListener {
                val intent = Intent(this, MainActivity7::class.java)
                startActivity(intent)

                val person2 = findViewById<ImageView>(R.id.person2)
                person2.setOnClickListener {
                    val intent = Intent(this, MainActivity8::class.java)
                    startActivity(intent)


                }
            }

                }

    }
}