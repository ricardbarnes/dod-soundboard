package cat.vonblum.dodsoundboard

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import cat.vonblum.dodsoundboard.ambience.application.find.FindAmbiencesQuery
import cat.vonblum.dodsoundboard.ambience.application.find.FindAmbiencesQueryHandler
import cat.vonblum.dodsoundboard.ambience.application.play.AmbiencePlayerCommandHandler
import cat.vonblum.dodsoundboard.ambience.ports.AmbienceProvider
import cat.vonblum.dodsoundboard.ambience.ports.AmbienceRepository
import cat.vonblum.dodsoundboard.ambience.ui.AmbienceAdapter
import com.vonblum.dodsoundboard.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var ambienceRepository: AmbienceRepository

    @Inject
    lateinit var ambienceProvider: AmbienceProvider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val findAmbiencesQueryHandler = FindAmbiencesQueryHandler(ambienceRepository)
        val ambiencesFinderResponse = findAmbiencesQueryHandler.handle(
            FindAmbiencesQuery(R.string.ambience_asset_limit)
        )
        val ambienceNamesList = ambiencesFinderResponse.nameList.map { it }
        val ambiencePlayerCommandHandler = AmbiencePlayerCommandHandler(ambienceProvider)
        val recyclerView = findViewById<RecyclerView>(R.id.ambiences)
        val ambiencesAdapter =
            AmbienceAdapter(
                ambienceNamesList,
                AmbiencePlayerCommandHandler(ambienceProvider)
            )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ambiencesAdapter
    }

}