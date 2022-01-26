package com.example.uicomponent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnInput = findViewById<Button>(R.id.btnInput)
        val btnCancel = findViewById<Button>(R.id.btnCancel)
        btnInput.setOnClickListener{
            Toast.makeText(this@MainActivity,"Inputan Telah Berhasi",
                Toast.LENGTH_LONG).show()
        }
        btnCancel.setOnClickListener({
            Toast.makeText( this@MainActivity, "Mereset Inputan", Toast.LENGTH_SHORT).show()
        })
    }
}