package com.sharma.growb
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        nxtButton.setOnClickListener {
        if (FirmName.length() != 0 && nop.length() != 0 && contact.length() != 0) {



            val intent = Intent(this, dashBoard::class.java)
            startActivity(intent)

            finish()
        } else {
            Toast.makeText(this, "Fields Can't be empty", Toast.LENGTH_LONG).show()

        }


    }
    }
}