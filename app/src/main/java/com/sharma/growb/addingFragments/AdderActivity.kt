package com.sharma.growb.addingFragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayout
import com.sharma.growb.R
import kotlinx.android.synthetic.main.activity_dash_board.*

class AdderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adder)
       supportActionBar?.hide()
        viewPager.adapter = AddPageAdapter(supportFragmentManager)
        val tabLayout = findViewById<TabLayout>(R.id.AddTabLayout)
        tabLayout.setupWithViewPager(viewPager)
    }
}