package com.vonblum.dodsoundboard.ambience.infrastructure.ui.android

import android.content.Context
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.vonblum.dodsoundboard.R

class AmbienceViewHolder(view: View, val context: Context) : RecyclerView.ViewHolder(view) {
    val ambienceId: TextView = view.findViewById(R.id.ambienceId) as TextView
}