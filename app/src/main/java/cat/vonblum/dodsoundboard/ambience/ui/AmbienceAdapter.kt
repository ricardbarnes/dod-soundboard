package cat.vonblum.dodsoundboard.ambience.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cat.vonblum.dodsoundboard.ambience.application.play.AmbiencePlayerCommandHandler
import com.vonblum.dodsoundboard.R

class AmbienceAdapter(
    private val ambienceNameList: List<String>,
    private val ambiencePlayerCommandHandler: AmbiencePlayerCommandHandler
) :
    RecyclerView.Adapter<AmbienceViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AmbienceViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.ambience_row, parent, false)
        return AmbienceViewHolder(view, parent.context)
    }

    override fun onBindViewHolder(holder: AmbienceViewHolder, position: Int) {
        val ambienceName = ambienceNameList[position]
        holder.ambienceId.text = ambienceName
        holder.itemView.setOnClickListener(
            AmbienceTouchListener(
                ambienceName,
                ambiencePlayerCommandHandler
            )
        )
    }

    override fun getItemCount(): Int {
        return ambienceNameList.size
    }

}