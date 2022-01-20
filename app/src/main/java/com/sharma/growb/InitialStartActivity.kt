package com.sharma.growb

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_dash_board.*


class InitialStartActivity() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_initial_start)
        supportActionBar?.hide()
        var pref = applicationContext.getSharedPreferences("MyPref", MODE_PRIVATE)
        var editor = pref.edit()
        editor.putInt("IsFirstTimeOpen", 1);
        editor.apply()
        val checker = pref.getInt("IsFirstTimeOpen", 0)
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            //Delay block of 2 sec or 2000 msec
//if(checker==1){
//    val intent= Intent(this,MainActivity::class.java)
//    startActivity(intent)
//}else{
    val intent= Intent(this,dashBoard::class.java)
    startActivity(intent)
//}

            finish()
                            }, 4000)




    }

}