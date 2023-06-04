package com.example.absensi.view.main

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.absensi.HomeFragment
import com.example.absensi.InfooFragment
import com.example.absensi.R
import com.example.absensi.utils.SessionLogin
import com.example.absensi.view.absen.AbsenActivity
import com.example.absensi.view.history.HistoryActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener { item: MenuItem ->
            when (item.itemId) {
                R.id.navigation_home -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.frame_container, HomeFragment()).commit()
                return@OnNavigationItemSelectedListener true
            }
                R.id.navigation_info -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frame_container, InfooFragment()).commit()
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        supportFragmentManager.beginTransaction().replace(R.id.frame_container, HomeFragment())
            .commit()
    }
}


