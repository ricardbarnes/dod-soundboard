package cat.vonblum.dodsoundboard

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import cat.vonblum.dodsoundboard.ambience.application.play.AmbiencePlayer
import cat.vonblum.dodsoundboard.ambience.provider.AndroidAmbienceProvider
import cat.vonblum.dodsoundboard.ambience.repository.AndroidAmbienceRepository
import cat.vonblum.dodsoundboard.ambience.ui.AmbienceAdapter
import com.vonblum.dodsoundboard.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ambienceRepository = AndroidAmbienceRepository(applicationContext)
        val ambiences = ambienceRepository.findAll()

        val recyclerView = findViewById<RecyclerView>(R.id.ambiences)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val ambienceProvider = AndroidAmbienceProvider(applicationContext)
        val ambiencesAdapter = AmbienceAdapter(ambiences, AmbiencePlayer(ambienceProvider))
        recyclerView.adapter = ambiencesAdapter
    }
}