package cat.vonblum.dodsoundboard

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import cat.vonblum.dodsoundboard.ambience.application.find.AmbiencesFinder
import cat.vonblum.dodsoundboard.ambience.application.find.AmbiencesFinderQueryHandler
import cat.vonblum.dodsoundboard.ambience.application.find.FindAmbiencesQuery
import cat.vonblum.dodsoundboard.ambience.application.play.AmbiencePlayer
import cat.vonblum.dodsoundboard.ambience.application.play.AmbiencePlayerCommandHandler
import cat.vonblum.dodsoundboard.ambience.provider.AndroidAmbienceProvider
import cat.vonblum.dodsoundboard.ambience.repository.AndroidAmbienceRepository
import cat.vonblum.dodsoundboard.ambience.ui.AmbienceAdapter
import com.vonblum.dodsoundboard.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ambienceRepository = AndroidAmbienceRepository(applicationContext)
        val ambiencesFinder = AmbiencesFinder(ambienceRepository)
        val ambiencesFinderQueryHandler = AmbiencesFinderQueryHandler(ambiencesFinder)
        val ambiencesFinderResponse =
            ambiencesFinderQueryHandler.handleSynchronously(FindAmbiencesQuery())
        val ambienceNamesList = ambiencesFinderResponse.nameList.map { it }
        val ambienceProvider = AndroidAmbienceProvider(applicationContext)
        val ambiencePlayer = AmbiencePlayer(ambienceProvider)
        val ambiencePlayerCommandHandler = AmbiencePlayerCommandHandler(ambiencePlayer)
        val recyclerView = findViewById<RecyclerView>(R.id.ambiences)
        val ambiencesAdapter = AmbienceAdapter(ambienceNamesList, ambiencePlayerCommandHandler)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ambiencesAdapter
    }
}