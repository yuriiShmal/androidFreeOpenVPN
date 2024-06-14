package com.androidfreevpn.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.androidfreevpn.R

class ConnectedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.connected_screen)

    }

    fun tryDisconnect(view: View) {
        Intent(applicationContext, DisconnectedSummaryActivity::class.java).also {
            startActivity(it)
        }
        finish()
    }


}