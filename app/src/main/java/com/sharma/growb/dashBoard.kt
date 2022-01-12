package com.sharma.growb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dash_board.*

class dashBoard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)
        supportActionBar?.hide()
        stock_button.setOnClickListener {
            val intent=Intent(this,StockActivity::class.java)
            startActivity(intent);

        }
    }
}