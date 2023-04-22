package cat.vonblum.dodsoundboard

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.vonblum.dodsoundboard.R
import cat.vonblum.dodsoundboard.ambience.infrastructure.ports.AndroidAmbienceProvider
import cat.vonblum.dodsoundboard.ambience.infrastructure.ui.AmbienceAdapter
import cat.vonblum.dodsoundboard.domain.core.model.Ambience

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ambience1 = Ambience.create(cat.vonblum.dodsoundboard.domain.core.model.AmbienceName("airplane"))
        val ambience2 = Ambience.create(cat.vonblum.dodsoundboard.domain.core.model.AmbienceName("bell"))
        val ambience3 = Ambience.create(cat.vonblum.dodsoundboard.domain.core.model.AmbienceName("creakmetal1"))

        val ambiences = listOf(ambience1, ambience2, ambience3)

        val recyclerView = findViewById<RecyclerView>(R.id.ambiences)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val ambienceProvider = AndroidAmbienceProvider(applicationContext)
        val ambiencesAdapter =
            AmbienceAdapter(ambiences,
                cat.vonblum.dodsoundboard.domain.application.play.AmbiencePlayer(ambienceProvider)
            )
        recyclerView.adapter = ambiencesAdapter
    }
}