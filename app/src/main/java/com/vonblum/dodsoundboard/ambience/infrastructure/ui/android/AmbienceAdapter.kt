package com.vonblum.dodsoundboard.ambience.infrastructure.ui.android

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vonblum.dodsoundboard.R
import com.vonblum.dodsoundboard.ambience.domain.model.Ambience
import com.vonblum.dodsoundboard.ambience.domain.ports.AmbiencePlayer

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
        holder.ambienceId.text = ambience.uri.value.path
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