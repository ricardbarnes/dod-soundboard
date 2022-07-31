package com.vonblum.dodsoundboard

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.vonblum.dodsoundboard.backend.ambiences.domain.Ambience
import com.vonblum.dodsoundboard.backend.ambiences.domain.AmbienceFilename
import com.vonblum.dodsoundboard.backend.ambiences.domain.AmbienceId
import com.vonblum.dodsoundboard.ui.ambiences.AmbienceAdapter
import com.vonblum.dodsoundboard.ui.ambiences.AmbienceTouchListener
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ambience1 = Ambience(
            AmbienceId(UUID.randomUUID()),
            AmbienceFilename("pepe.wav")
        )
        val ambiences = listOf(ambience1)

        val recyclerView = findViewById<RecyclerView>(R.id.ambiences)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val ambiencesAdapter = AmbienceAdapter(ambiences)
        recyclerView.adapter = ambiencesAdapter
        val ambienceTouchListener = AmbienceTouchListener(this) // TODO
        recyclerView.setOnClickListener(ambienceTouchListener)
    }
}