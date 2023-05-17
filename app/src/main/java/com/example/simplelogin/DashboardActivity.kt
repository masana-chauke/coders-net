package com.example.simplelogin

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.smarteist.autoimageslider.SliderView
import java.util.*


import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
class DashboardActivity : AppCompatActivity() {
    // creating variable for slider view
    lateinit var sliderView: SliderView

//     on below line creating variables for image urls.
    var url1 =
        "https://e1.pxfuel.com/desktop-wallpaper/898/482/desktop-wallpaper-200-beautiful-software-engineer-for-you-software-engineer.jpg"
    var url2 =
        "https://w0.peakpx.com/wallpaper/1021/487/HD-wallpaper-technology-code-programming-programmer.jpg"
    var url3 =
        "https://quotefancy.com/media/wallpaper/3840x2160/2000910-Joel-Spolsky-Quote-Good-software-like-wine-takes-time.jpg"
    var url4 = "https://img.freepik.com/free-photo/rear-view-programmer-working-all-night-long_1098-18697.jpg?w=2000&t=st=1684302472~exp=1684303072~hmac=97f7c2175cf79b5bfaf3979353ca0d499d375b28e2cbbb925d713f5da31e5a05.jpg"
    var url5 = "https://wallpapercave.com/wp/wp1867881.jpg"
    var url6 = "https://wallpapercave.com/w/wp1867882.jpg"
    var url7 = "https://wallpapercave.com/w/wp1867878.jpg"
    var url8 = "https://wallpapercave.com/w/wp1867909.jpg"
    var url9 = "https://img.freepik.com/free-vector/digital-coding-background-with-numbers-zero-one_1017-30363.jpg?w=2000&t=st=1684302623~exp=1684303223~hmac=c16fec4f43ea45513cf5a6308835c2be30721fdb5ed82c0fd8f9e471a15ea68d.jpg"
    var url10 = "https://wallpapercave.com/w/wp1867881.jpg"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        // on below line initializing variables for auto image slider.
        sliderView = findViewById(R.id.slider)
        // on below line creating variable for array list.
        val sliderDataArrayList: ArrayList<String> = ArrayList()
        // on below line adding urls in slider list.
        sliderDataArrayList.add(url1)
        sliderDataArrayList.add(url2)
        sliderDataArrayList.add(url3)
        sliderDataArrayList.add(url4)
        sliderDataArrayList.add(url5)
        sliderDataArrayList.add(url6)
        sliderDataArrayList.add(url7)
        sliderDataArrayList.add(url8)
        sliderDataArrayList.add(url9)
        sliderDataArrayList.add(url10)
        // on below line initializing our adapter class by passing our list to it.
        val adapter = SliderAdapter(sliderDataArrayList)
        // on below line setting auto cycle direction for slider view from left to right.
        sliderView.setAutoCycleDirection(SliderView.LAYOUT_DIRECTION_LTR);
        // on below line setting adapter for slider view.
        sliderView.setSliderAdapter(adapter);
        // on below line setting scroll time for slider view
        sliderView.setScrollTimeInSec(3);
        // on below line setting auto cycle for slider view.
        sliderView.setAutoCycle(true);
        // on below line setting start cycle for slider view.
        sliderView.startAutoCycle();

    }
}