package com.example.simplelogin


import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.io.PrintStream
import java.lang.System.out


class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.bottomnav)
        bottomNavigationView.setOnNavigationItemSelectedListener(this)

        loadFragment(DashboardFragment())
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        var fragment: Fragment? = null
        when (item.itemId) {
            R.id.dashboard -> fragment = DashboardFragment()
        }
        if (fragment != null) {
            loadFragment(fragment)
            return true
        }
        return false
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.relativelayout, fragment)
            .commit()
        val i = Intent(this@MainActivity, DashboardActivity::class.java)
        i.putExtra("STRING_DATE", out)
        startActivity(i)
    }
}

private fun Intent.putExtra(s: String, out: PrintStream?) {

}
