package com.vonblum.dodsoundboard

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.vonblum.dodsoundboard.backend.command.Command
import com.vonblum.dodsoundboard.backend.command.CommandService
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

//    private val SOUND_URL = "voices/german/ger_backup.wav"

    @Inject
    lateinit var command: Command

    @Inject
    lateinit var commandService: CommandService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun playSound(view: View) {
        val message = commandService.run()
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()

//        val fileDescriptor = assets.openFd(SOUND_URL)
//
//        val player = MediaPlayer()
//        player.setDataSource(
//            fileDescriptor.fileDescriptor,
//            fileDescriptor.startOffset,
//            fileDescriptor.length
//        )
//        player.prepare()
//        player.start()
//
//        Toast.makeText(this, "Pepe!", Toast.LENGTH_LONG).show()
    }
}