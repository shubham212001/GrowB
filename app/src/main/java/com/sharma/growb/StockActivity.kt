package com.sharma.growb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sharma.growb.database.database
import com.sharma.growb.database.sales_entity
import kotlinx.android.synthetic.main.activity_stock.*


const val DB_NAME = "todo.db"
class StockActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stock)
        supportActionBar?.hide()

    }
}