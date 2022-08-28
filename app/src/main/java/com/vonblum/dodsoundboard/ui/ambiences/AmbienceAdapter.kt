package com.vonblum.dodsoundboard.ui.ambiences

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vonblum.dodsoundboard.R
import com.vonblum.dodsoundboard.backend.ambiences.domain.Ambience

class AmbienceAdapter(private val ambienceList: List<Ambience>) :
    RecyclerView.Adapter<AmbienceViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AmbienceViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.ambience_row, parent, false)
        return AmbienceViewHolder(view, parent.context)
    }

    override fun onBindViewHolder(holder: AmbienceViewHolder, position: Int) {
        val ambience = ambienceList[position]
        holder.ambienceId.text = ambience.filename().value
        holder.itemView.setOnClickListener(
            AmbienceTouchListener(
                holder.context,
                ambience
            )
        )
    }

    override fun getItemCount(): Int {
        return ambienceList.size
    }
}