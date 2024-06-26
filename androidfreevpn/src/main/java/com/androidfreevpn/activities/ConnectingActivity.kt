/*
*   androidFreeOpenVPN acts as a custom UI for ics-openvpn and provides 1 free slow VPN server.

    This file is a part of the androidFreeOpenVPN app.

    Copyright (C) 2024 Yurii Shmal

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
* */

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