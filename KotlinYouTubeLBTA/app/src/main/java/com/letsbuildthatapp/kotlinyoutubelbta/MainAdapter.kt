package com.letsbuildthatapp.kotlinyoutubelbta

import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.*
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.video_row.view.*
import java.lang.reflect.Constructor

/**
 * Created by brianvoong on 12/18/17.
 */

class MainAdapter: Adapter<CustomViewHolder>() {

    val videoTitles = listOf("First title", "Second", "3rd", "MOOOOORE TITLE")

    // numberOfItems
    override fun getItemCount(): Int {
        return videoTitles.size
    }
    //override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CustomViewHolder {
    // how do we even create a view
    //    val layoutInflater = LayoutInflater.from(parent?.context)
    //    val cellForRow = layoutInflater.inflate(R.layout.video_row, parent, false)
    //   return CustomViewHolder(cellForRow)
    //}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        // how do we even create a view
        val layoutInflater = LayoutInflater.from(parent.context)
        val cellForRow = layoutInflater.inflate(R.layout.video_row, parent, false)
        return CustomViewHolder(cellForRow)
    }

    //override fun onBindViewHolder(holder: CustomViewHolder?, position: Int) {
    //    val videoTitle = videoTitles.get(position)
    //   holder?.view?.textView_video_title?.text = videoTitle
    //}
    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val videoTitle = videoTitles[position]
        holder.view.textView_video_title?.text = videoTitle
    }

}

class CustomViewHolder(val view: View): ViewHolder(view) {

}