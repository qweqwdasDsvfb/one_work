package com.mercy.aaaa

import android.content.Intent

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class SongDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_song_detail)

        val song = intent.getSerializableExtra("song") as Song

        val titleTextView: TextView = findViewById(R.id.titleTextView)
        val artistTextView: TextView = findViewById(R.id.artistTextView)
        val imageView: ImageView = findViewById(R.id.imageView)
        val textTextView: TextView = findViewById(R.id.textTextView)

        titleTextView.text = song.title
        artistTextView.text = song.artist
        textTextView.text = song.text
        Glide.with(this).load(song.imageUrl).into(imageView)
    }
}
