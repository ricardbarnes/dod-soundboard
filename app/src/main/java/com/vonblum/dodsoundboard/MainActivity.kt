package com.vonblum.dodsoundboard

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

const val SOUND_URL = "voices/german/ger_backup.wav"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun playSound() {
        val fileDescriptor = assets.openFd(SOUND_URL)

        val player = MediaPlayer()
        player.setDataSource(
            fileDescriptor.fileDescriptor,
            fileDescriptor.startOffset,
            fileDescriptor.length
        )
        player.prepare()
        player.start()

        Toast.makeText(this, "Pepe!", Toast.LENGTH_LONG).show()
    }
}