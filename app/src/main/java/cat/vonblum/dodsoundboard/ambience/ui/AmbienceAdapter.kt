package cat.vonblum.dodsoundboard.ambience.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cat.vonblum.dodsoundboard.ambience.application.play.AmbiencePlayer
import cat.vonblum.dodsoundboard.ambience.model.Ambience
import com.vonblum.dodsoundboard.R

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