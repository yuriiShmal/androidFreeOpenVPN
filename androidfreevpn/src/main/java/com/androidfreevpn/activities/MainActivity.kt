package com.androidfreevpn.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.androidfreevpn.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun tryConnect(view: View) {
        Intent(applicationContext, ConnectingActivity::class.java).also {
            startActivity(it)
        }
        finish()
    }


}