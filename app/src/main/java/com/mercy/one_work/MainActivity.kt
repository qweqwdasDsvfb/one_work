package com.mercy.one_work

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

data class Animal(var name: String, val description: String, val imageResId: Int)
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //////////////////////

        val dogButton = findViewById<Button>(R.id.dog_Button)
        dogButton.setOnClickListener {
            val intent = Intent(this, AnimalDetailsActivity::class.java)
            intent.putExtra("animalName", "Ronik")
            intent.putExtra("animalDescription", "13-year-old dog. With an extremely kind heart.")
            startActivity(intent)
        }
            // кнопка


        val catButton = findViewById<Button>(R.id.cat_Button)
        catButton.setOnClickListener {
            val intent = Intent(this, AnimalDetailsActivity::class.java)
            intent.putExtra("animalName", "Yuzik")
            intent.putExtra("animalDescription", "A black cat. 4 years. Likes to scream in the morning.")
            startActivity(intent)
        }




        val cat2Button = findViewById<Button>(R.id.cat2_Button)
        cat2Button.setOnClickListener {
            val intent = Intent(this, AnimalDetailsActivity::class.java)
            intent.putExtra("animalName", "Silver")
            intent.putExtra("animalDescription", "A gray cat. 2 years. Enjoys long naps.")
            startActivity(intent)
        }

    }
}