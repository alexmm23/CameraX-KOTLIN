package com.example.cameraxapp

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class VideoDisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_display)

        val videoView: VideoView = findViewById(R.id.video_view)

        val videoUri: Uri? = intent.getParcelableExtra("video_uri")

        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController)

        videoUri?.let {
            videoView.setVideoURI(it)
            videoView.start()
        }
    }
}