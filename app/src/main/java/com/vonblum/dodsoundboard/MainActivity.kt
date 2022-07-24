package com.vonblum.dodsoundboard

import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    companion object {
        const val SOUND_URL = "ambiences/airplane.wav"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun playSound(view: View) {
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