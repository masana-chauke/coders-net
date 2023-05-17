package com.example.simplelogin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CourseAdapter(private val context: Context, courseModelArrayList: ArrayList<CourseModel>) :
    RecyclerView.Adapter<CourseAdapter.ViewHolder>() {
    private val courseModelArrayList: ArrayList<CourseModel>
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseAdapter.ViewHolder {
        // to inflate the layout for each item of recycler view.
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.activity_news, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: CourseAdapter.ViewHolder, position: Int) {
        // to set data to textview and imageview of each card layout
        val model: CourseModel = courseModelArrayList[position]
        holder.courseNameTV.setText(model.getCourse_name())
        holder.courseIV.setImageResource(model.getCourse_image())
    }

    override fun getItemCount(): Int {
        // this method is used for showing number of card items in recycler view.
        return courseModelArrayList.size
    }

    // View holder class for initializing of your views such as TextView and Imageview.
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        public val courseIV: ImageView
        public val courseNameTV: TextView

        init {
            courseIV = itemView.findViewById(R.id.idIVCourseImage)
            courseNameTV = itemView.findViewById(R.id.idTVCourseName)
        }
    }
    // Constructor
    init {
        this.courseModelArrayList = courseModelArrayList
    }
}