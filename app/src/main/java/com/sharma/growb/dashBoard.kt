package com.sharma.growb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.sharma.growb.ScrollingFragments.page_adapter
import com.sharma.growb.database.database
import com.sharma.growb.database.sales_entity
import kotlinx.android.synthetic.main.activity_dash_board.*


open class dashBoard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)
        supportActionBar?.hide()


        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        viewPager.adapter = page_adapter(supportFragmentManager)

        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        tabLayout.setupWithViewPager(viewPager)

        stock_button.setOnClickListener {
            val intent=Intent(this,StockActivity::class.java)
            startActivity(intent);
            finish()

        }
        //        todorv.apply {
//            layoutManager = LinearLayoutManager(this@MainActivity)
//            adapter = this.adapter
//        }
        }
}