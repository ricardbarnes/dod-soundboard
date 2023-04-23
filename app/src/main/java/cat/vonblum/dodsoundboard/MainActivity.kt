package cat.vonblum.dodsoundboard

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import cat.vonblum.dodsoundboard.ambience.application.play.AmbiencePlayer
import cat.vonblum.dodsoundboard.ambience.config.AndroidAmbienceConfig
import cat.vonblum.dodsoundboard.ambience.provider.AndroidAmbienceProvider
import cat.vonblum.dodsoundboard.ambience.repository.AndroidAmbienceRepository
import cat.vonblum.dodsoundboard.ambience.ui.AmbienceAdapter
import com.vonblum.dodsoundboard.R
import com.vonblum.dodsoundboard.shared.infrastructure.android.AndroidConfig

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ambienceRepository =
            AndroidAmbienceRepository(assets, AndroidAmbienceConfig.AMBIENCE_ASSET_FOLDER)
        val ambiences = ambienceRepository.findAll()

        val recyclerView = findViewById<RecyclerView>(R.id.ambiences)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val ambienceProvider = AndroidAmbienceProvider(
            applicationContext,
            AndroidAmbienceConfig.AMBIENCE_ASSET_FOLDER,
            AndroidConfig.SOUND_FILE_EXTENSION
        )
        val ambiencesAdapter = AmbienceAdapter(ambiences, AmbiencePlayer(ambienceProvider))
        recyclerView.adapter = ambiencesAdapter
    }
}