package com.androidfreevpn.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.androidfreevpn.R

class ConnectingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_connecting)

    }

    override fun onStart() {
        super.onStart()
        Intent(applicationContext, ConnectedActivity::class.java).also {
            startActivity(it)
        }
        finish()

    }




}