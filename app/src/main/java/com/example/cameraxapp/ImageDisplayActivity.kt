package com.example.cameraxapp

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ImageDisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_display)

        val imageView: ImageView = findViewById(R.id.image_view)

        // Recibe la URI de la imagen desde el Intent
        val imageUri: Uri? = intent.getParcelableExtra("image_uri")

        // Muestra la imagen en el ImageView si no es null
        imageUri?.let {
            imageView.setImageURI(it)
        }
    }
}