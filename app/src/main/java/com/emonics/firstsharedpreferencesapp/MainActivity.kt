package com.emonics.firstsharedpreferencesapp

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

   lateinit var prefHelper: PrefHelper


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        prefHelper = PrefHelper(this)

        val button = findViewById<Button>(R.id.btnNext)

        prefHelper.put("NAME", "EMONICS")
        prefHelper.put("ID", "123")

        //Create shared preference object
//        val sharedPreferences: SharedPreferences = this.getSharedPreferences(sharedPreferencesFile, Context.MODE_PRIVATE)
//        val editor:SharedPreferences.Editor = sharedPerefences.edit()
//        editor.putString("ID", "ABC#@1234")
//        editor.putInt("ID", 123456789)
//        editor.apply()

        //Goes from mainActvity to the second activity
        button.setOnClickListener {
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}