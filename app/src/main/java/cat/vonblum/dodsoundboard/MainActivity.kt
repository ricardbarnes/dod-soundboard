package cat.vonblum.dodsoundboard

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import cat.vonblum.dodsoundboard.ambience.application.find.FindAmbiencesQueryHandler
import cat.vonblum.dodsoundboard.ambience.application.find.FindAmbiencesQuery
import cat.vonblum.dodsoundboard.ambience.application.play.AmbiencePlayerCommandHandler
import cat.vonblum.dodsoundboard.ambience.provider.AndroidAmbienceProvider
import cat.vonblum.dodsoundboard.ambience.repository.AndroidAmbienceRepository
import cat.vonblum.dodsoundboard.ambience.ui.AmbienceAdapter
import com.vonblum.dodsoundboard.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val androidAmbienceRepository = AndroidAmbienceRepository(applicationContext)
        val findAmbiencesQueryHandler = FindAmbiencesQueryHandler(androidAmbienceRepository)
        val ambiencesFinderResponse = findAmbiencesQueryHandler.handle(
            FindAmbiencesQuery(R.string.ambience_asset_limit)
        )
        val ambienceNamesList = ambiencesFinderResponse.nameList.map { it }
        val androidAmbienceProvider = AndroidAmbienceProvider(applicationContext)
        val ambiencePlayerCommandHandler = AmbiencePlayerCommandHandler(androidAmbienceProvider)
        val recyclerView = findViewById<RecyclerView>(R.id.ambiences)
        val ambiencesAdapter =
            AmbienceAdapter(ambienceNamesList, AmbiencePlayerCommandHandler(androidAmbienceProvider))

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ambiencesAdapter
    }

}