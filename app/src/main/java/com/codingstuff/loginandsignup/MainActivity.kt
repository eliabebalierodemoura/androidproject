package com.codingstuff.loginandsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

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

                    var exitButton: Button = findViewById(R.id.exitButton)
                    exitButton.setOnClickListener {
                        val alertdialog: AlertDialog = AlertDialog.Builder(this).create()
                        alertdialog.setTitle("are you sure you want to exit?")
                        alertdialog.setButton(AlertDialog.BUTTON_POSITIVE, "yes") {
                                dialog, which -> finish()
                            dialog.dismiss()
                        }

                        alertdialog.setButton(AlertDialog.BUTTON_NEGATIVE, "no") {
                                dialog, which ->
                            dialog.dismiss()

                        }
                        alertdialog.show()
                    }
                }
            }
        }
    }
}
