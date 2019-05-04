package com.letsbuildthatapp.kotlinyoutubelbta

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.*
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import android.widget.ToggleButton
//import kotlinx.android.synthetic.main.video_row.view.*
import kotlinx.android.synthetic.main.show_recent_url_rows.view.*
import java.lang.reflect.Constructor

/**
 * Working Demo
 */

class MainAdapter: Adapter<CustomViewHolder>() {
    private val name_of_url = arrayListOf<String>(
            "www.youtube.com" , "www.google.com" , "pagead2.googlesyndication.com" , "nrdp512appboot.netflix.com"
    )
    private val blockstatus = arrayListOf<String>(
            "ok" , "blocked" , "ok" , "blocked"
    )
    private val timestamp = arrayListOf<String>(
            "10:31:04" , "10:31:10" , "10:31:14" , "10:31:16"
    )

    // numberOfItems
    override fun getItemCount(): Int {
        return name_of_url.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        // how do we even create a view
        val layoutInflater = LayoutInflater.from(parent.context)
        val cellForRow = layoutInflater.inflate(R.layout.show_recent_url_rows, parent, false)


        return CustomViewHolder(cellForRow)
    }
    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {

        val timestamp = timestamp[position]
        val names = name_of_url[position]
        val blockstatus = blockstatus[position]
        holder.view.timestamp_textView?.text = timestamp
        holder.view.name_of_url_textView?.text = names
        holder.view.blockstatus_textview?.text = blockstatus
    }

}

//class CustomViewHolder(val view: View): ViewHolder(view) {

//}

/* This will make click reload screen. Think I need to add button in here.
class CustomViewHolder(val view: View): RecyclerView.ViewHolder(view) {

    init {
        view.setOnClickListener {
            val intent = Intent(view.context, MainActivity::class.java) //CourseDetailActivity::class.java)
            view.context.startActivity(intent)
        }
    }

}*/
class CustomViewHolder(val view: View): ViewHolder(view) {
    init {

        view.findViewById<ToggleButton>(R.id.tempwhite_blacklist2).setOnCheckedChangeListener { _, isChecked ->
            if (isChecked)
                Toast.makeText(this.view.context, "GO!", Toast.LENGTH_SHORT).show()
            else {
                Toast.makeText(this.view.context, "STOP!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}