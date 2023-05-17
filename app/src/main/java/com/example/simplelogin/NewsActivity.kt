package com.example.simplelogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val courseRV = findViewById<RecyclerView>(R.id.idRVCourse)

        // Here, we have created new array list and added data to it
        val courseModelArrayList: ArrayList<CourseModel> = ArrayList<CourseModel>()
//        courseModelArrayList.add(CourseModel("DSA in Java", 4, R.drawable.img_1))
        courseModelArrayList.add(CourseModel("Typescript for beginners", 3, R.drawable.img_7))
        courseModelArrayList.add(CourseModel("Kotlin new Updates", 4, R.drawable.img_4))
        courseModelArrayList.add(CourseModel("Java builds first Automation program", 4, R.drawable.img_5))
        courseModelArrayList.add(CourseModel("Angular for Frontend", 4, R.drawable.img_6))


        // we are initializing our adapter class and passing our arraylist to it.
        val courseAdapter = CourseAdapter(this, courseModelArrayList)

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        val linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        // in below two lines we are setting layoutmanager and adapter to our recycler view.
        courseRV.layoutManager = linearLayoutManager
        courseRV.adapter = courseAdapter
    }
}