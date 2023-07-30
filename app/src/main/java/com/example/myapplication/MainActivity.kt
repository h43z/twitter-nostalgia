package com.example.myapplication

import android.content.ComponentName
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = Intent()
        intent.component = ComponentName("com.twitter.android",  "com.twitter.android.StartActivity")
        startActivity(intent)
        finish()
    }
}