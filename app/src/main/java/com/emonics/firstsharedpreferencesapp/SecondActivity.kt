package com.emonics.firstsharedpreferencesapp

import android.content.SharedPreferences
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    lateinit var prefHelper: PrefHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        prefHelper = PrefHelper(this)

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = prefHelper.getString("NAME")
    }
}