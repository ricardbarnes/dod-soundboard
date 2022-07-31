package com.vonblum.dodsoundboard.ui.ambiences

import android.content.Context
import android.view.View
import android.widget.Toast

class AmbienceTouchListener(private val context: Context) : View.OnClickListener {
    override fun onClick(p0: View?) {
        Toast.makeText(context, "PEPE!", Toast.LENGTH_LONG).show()
    }
}