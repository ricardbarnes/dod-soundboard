package com.vonblum.dodsoundboard.ui.ambiences

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.vonblum.dodsoundboard.R

class AmbienceViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    var ambienceId: TextView = view.findViewById(R.id.ambienceId) as TextView

}