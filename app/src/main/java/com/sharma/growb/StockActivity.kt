package com.sharma.growb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.sharma.growb.database.database
import com.sharma.growb.database.sales_entity
import kotlinx.android.synthetic.main.activity_stock.*


const val DB_NAME = "database.db"
class StockActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stock)
        supportActionBar?.hide()

        //supportActionBar?.hide()
        val list = arrayListOf<sales_entity>()
        // var adapter = task_adapter(list)

        val db by lazy {
            database.getDatabase(this)
        }
        add_item_in_sales.setOnClickListener {
            val ItemID = FirmName.text.toString()
            val NOP = nop.text.toString()
            val itemPrice = item_price.text.toString()
            if (ItemID.length != 0 && NOP.length != 0 && itemPrice.length != 0 ) {

//                GlobalScope.launch(Dispatchers.Main) {
//                    val id = withContext(Dispatchers.IO) {
//                        return@withContext db.Dao().add_sales(
//                            sales_entity(
//                                ItemID ,
//                                NOP,
//                                itemPrice
//                            )
//                        )
//                    }
//
//
//                }
                val intent=Intent(this,dashBoard::class.java)
                startActivity(intent)
                finish()
            }
            else {
                Toast.makeText(this,"Fields Can't be empty", Toast.LENGTH_LONG).show()
            }
        }
    }
}