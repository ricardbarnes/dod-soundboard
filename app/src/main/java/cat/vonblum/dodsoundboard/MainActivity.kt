package cat.vonblum.dodsoundboard

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import cat.vonblum.dodsoundboard.ambience.application.find.FindAmbiencesQuery
import cat.vonblum.dodsoundboard.ambience.application.find.FindAmbiencesResponse
import cat.vonblum.dodsoundboard.ambience.ui.AmbienceAdapter
import cat.vonblum.dodsoundboard.shared.domain.bus.command.CommandBus
import cat.vonblum.dodsoundboard.shared.domain.bus.query.QueryBus
import com.vonblum.dodsoundboard.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var commandBus: CommandBus

    @Inject
    lateinit var queryBus: QueryBus

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ambiencesFinderResponse =
            queryBus.ask(FindAmbiencesQuery(R.string.ambience_asset_limit)) as FindAmbiencesResponse
        val ambienceNamesList = ambiencesFinderResponse.nameList.map { it }
        val recyclerView = findViewById<RecyclerView>(R.id.ambiences)
        val ambiencesAdapter =
            AmbienceAdapter(ambienceNamesList, commandBus)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ambiencesAdapter
    }

}