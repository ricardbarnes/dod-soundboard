package cat.vonblum.dodsoundboard

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.vonblum.dodsoundboard.R
import cat.vonblum.dodsoundboard.ambience.domain.application.play.AmbiencePlayer
import cat.vonblum.dodsoundboard.ambience.domain.model.Ambience
import cat.vonblum.dodsoundboard.ambience.domain.model.AmbienceName
import cat.vonblum.dodsoundboard.ambience.domain.ports.AmbienceProvider
import cat.vonblum.dodsoundboard.ambience.infrastructure.ports.AndroidAmbienceProvider
import cat.vonblum.dodsoundboard.ambience.infrastructure.ui.AmbienceAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ambience1 = Ambience.create(AmbienceName("airplane"))
        val ambience2 = Ambience.create(AmbienceName("bell"))
        val ambience3 = Ambience.create(AmbienceName("creakmetal1"))

        val ambiences = listOf(ambience1, ambience2, ambience3)

        val recyclerView = findViewById<RecyclerView>(R.id.ambiences)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val ambienceProvider = AndroidAmbienceProvider(applicationContext)
        val ambiencesAdapter =
            AmbienceAdapter(ambiences, AmbiencePlayer(ambienceProvider))
        recyclerView.adapter = ambiencesAdapter
    }
}