package com.sharma.growb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.sharma.growb.database.database
import com.sharma.growb.database.sales_entity
import kotlinx.android.synthetic.main.activity_dash_board.*


open class dashBoard : AppCompatActivity(),listener {
    val db by lazy {
        database.getDatabase(this)
    }
    val list = arrayListOf<sales_entity>()
    var adapter = sales_adapter(list,this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)
        supportActionBar?.hide()

//        sales_recycler.layoutManager= LinearLayoutManager(this)
//        var Adapter =sales_recycler.adapter
//        sales_recycler.adapter=adapter
//        db.Dao().get_all().observe(this, Observer {
//
//            list.clear()
//            list.addAll(it)
//            adapter.notifyDataSetChanged()
//
//
//        })

        stock_button.setOnClickListener {
            val intent=Intent(this,StockActivity::class.java)
            startActivity(intent);

        }
        //        todorv.apply {
//            layoutManager = LinearLayoutManager(this@MainActivity)
//            adapter = this.adapter
//        }
        }



    override fun delete_task(input: sales_entity) {
        TODO("Not yet implemented")
    }

    override fun share(input: sales_entity) {
        TODO("Not yet implemented")
    }

    override fun update_task(input: sales_entity) {
        TODO("Not yet implemented")
    }
}