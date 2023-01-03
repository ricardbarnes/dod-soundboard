package com.vonblum.dodsoundboard

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.vonblum.dodsoundboard.ambience.domain.model.Ambience
import com.vonblum.dodsoundboard.ambience.domain.model.AmbienceUri
import com.vonblum.dodsoundboard.ambience.domain.model.AmbienceId
import com.vonblum.dodsoundboard.ambience.infrastructure.ports.player.AndroidAmbiencePlayer
import com.vonblum.dodsoundboard.ambience.infrastructure.ui.android.AmbienceAdapter
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ambience1 = Ambience(
            AmbienceId(UUID.randomUUID()),
            AmbienceUri("ambiences/airplane.wav")
        )
        val ambience2 = Ambience(
            AmbienceId(UUID.randomUUID()),
            AmbienceUri("ambiences/bell.wav")
        )
        val ambience3 = Ambience(
            AmbienceId(UUID.randomUUID()),
            AmbienceUri("ambiences/creakmetal1.wav")
        )
        val ambiences = listOf(ambience1, ambience2, ambience3)

        val recyclerView = findViewById<RecyclerView>(R.id.ambiences)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val ambiencesAdapter = AmbienceAdapter(ambiences, AndroidAmbiencePlayer())
        recyclerView.adapter = ambiencesAdapter
    }
}