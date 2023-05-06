package cat.vonblum.dodsoundboard

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import cat.vonblum.dodsoundboard.ambience.application.find.FindAmbiencesQuery
import cat.vonblum.dodsoundboard.ambience.application.find.FindAmbiencesQueryHandler
import cat.vonblum.dodsoundboard.ambience.application.play.PlayAmbienceCommandHandler
import cat.vonblum.dodsoundboard.ambience.ui.AmbienceAdapter
import com.vonblum.dodsoundboard.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var playAmbienceCommandHandler: PlayAmbienceCommandHandler

    @Inject
    lateinit var findAmbiencesQueryHandler: FindAmbiencesQueryHandler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ambiencesFinderResponse =
            findAmbiencesQueryHandler.handle(FindAmbiencesQuery(R.string.ambience_asset_limit))
        val ambienceNamesList = ambiencesFinderResponse?.nameList?.map { it }
        val recyclerView = findViewById<RecyclerView>(R.id.ambiences)
        val ambiencesAdapter =
            ambienceNamesList?.let { AmbienceAdapter(it, playAmbienceCommandHandler) }

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ambiencesAdapter
    }

}