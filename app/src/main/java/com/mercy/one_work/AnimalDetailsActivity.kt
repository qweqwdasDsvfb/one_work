package com.mercy.one_work

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AnimalDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val animalName = intent.getStringExtra("animalName")
        val animalDescription = intent.getStringExtra("animalDescription")


        val animalNameTextView = findViewById<TextView>(R.id.textView2)  // рандомний текст
        val animalDescriptionTextView = findViewById<TextView>(R.id.Ronik_detail)


        animalNameTextView.text = animalName
        animalDescriptionTextView.text = animalDescription
    }




    }
