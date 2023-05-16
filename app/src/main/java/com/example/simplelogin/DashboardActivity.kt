package com.example.simplelogin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.smarteist.autoimageslider.SliderView
import java.util.*
class DashboardActivity : AppCompatActivity() {
    // creating variable for slider view
    lateinit var sliderView: SliderView

    // on below line creating variables for image urls.
    var url1 =
        "https://e1.pxfuel.com/desktop-wallpaper/898/482/desktop-wallpaper-200-beautiful-software-engineer-for-you-software-engineer.jpg"
    var url2 =
        "https://w0.peakpx.com/wallpaper/1021/487/HD-wallpaper-technology-code-programming-programmer.jpg"
    var url3 =
        "https://quotefancy.com/media/wallpaper/3840x2160/2000910-Joel-Spolsky-Quote-Good-software-like-wine-takes-time.jpg"

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