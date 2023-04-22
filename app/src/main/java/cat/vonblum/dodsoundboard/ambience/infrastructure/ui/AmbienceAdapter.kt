package cat.vonblum.dodsoundboard.ambience.infrastructure.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vonblum.dodsoundboard.R
import cat.vonblum.dodsoundboard.domain.application.play.AmbiencePlayer
import cat.vonblum.dodsoundboard.domain.model.Ambience

class AmbienceAdapter(
    private val ambienceList: List<Ambience>,
    private val ambiencePlayer: AmbiencePlayer
) :
    RecyclerView.Adapter<AmbienceViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AmbienceViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.ambience_row, parent, false)
        return AmbienceViewHolder(view, parent.context)
    }

    override fun onBindViewHolder(holder: AmbienceViewHolder, position: Int) {
        val ambience = ambienceList[position]
        holder.ambienceId.text = ambience.name.value
        holder.itemView.setOnClickListener(
            AmbienceTouchListener(
                holder.context,
                ambience,
                ambiencePlayer
            )
        )
    }

    override fun getItemCount(): Int {
        return ambienceList.size
    }
}