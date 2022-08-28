package com.vonblum.dodsoundboard.ui.ambiences

import android.content.Context
import android.view.View
import android.widget.Toast
import com.vonblum.dodsoundboard.backend.ambiences.domain.Ambience

class AmbienceTouchListener(private val context: Context, private val ambience: Ambience) :
    View.OnClickListener {
    override fun onClick(p0: View?) {
        Toast.makeText(context, ambience.filename().value, Toast.LENGTH_SHORT).show()
    }
}