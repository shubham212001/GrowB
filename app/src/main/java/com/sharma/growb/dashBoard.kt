package com.sharma.growb

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayout
import com.sharma.growb.ScrollingFragments.page_adapter
import kotlinx.android.synthetic.main.activity_dash_board.*


open class dashBoard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)
        supportActionBar?.hide()
        var pref = applicationContext.getSharedPreferences("MyPref", MODE_PRIVATE)
        var editor = pref.edit()
        val data1 = pref.getString("ToCollect", null)
        tocollect.setText(data1)

        val data2 = pref.getString("ToPay", null)
        topay.setText(data2)
        val data3 = pref.getString("CompanyName", null)
        Dashboard.setText(data3)
        viewPager.adapter = page_adapter(supportFragmentManager)

        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        tabLayout.setupWithViewPager(viewPager)

        create_newButton.setOnClickListener {
            val intent=Intent(this, StockActivity::class.java)
            startActivity(intent);
            finish()

        }
        saveChanges.setOnClickListener {
            var temp1:String=tocollect.text.toString()
            var temp2:String=topay.text.toString()

            editor.putString("ToCollect", temp1);
            editor.putString("ToPay", temp2);
            editor.apply();
            Toast.makeText(applicationContext, "To Collect and To Pay Data Saved", Toast.LENGTH_SHORT).show()
        }
        create_newButton.setOnClickListener{

            val intent=Intent(this,AdderActivity::class.java)
            startActivity(intent)

        }


        }
}