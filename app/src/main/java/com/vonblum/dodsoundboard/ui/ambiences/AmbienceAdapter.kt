package com.vonblum.dodsoundboard.ui.ambiences

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.vonblum.dodsoundboard.R
import com.vonblum.dodsoundboard.backend.ambiences.domain.Ambience

class AmbienceAdapter(private val ambienceList: List<Ambience>) :
    RecyclerView.Adapter<AmbienceAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var ambienceId: TextView = view.findViewById(R.id.ambienceId) as TextView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.ambience_row, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.ambienceId.text = ambienceList[position].filename().value
    }

    override fun getItemCount(): Int {
        return ambienceList.size
    }
}