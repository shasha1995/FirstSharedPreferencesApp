package com.emonics.firstsharedpreferencesapp

import android.content.Context
import android.content.SharedPreferences

class PrefHelper(context: Context) {
    private val PREFS_NAME = "mySharedPreferences"

    //create object for the shared preferences
    private lateinit var sharedPreferences: SharedPreferences
    //Create an editor
    val editor: SharedPreferences.Editor

    init {
        sharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        editor = sharedPreferences.edit()
    }
    fun put(key: String, value: String){
        editor.putString(key, value).apply()
    }
    fun put(key: String, value: Int){
        editor.putInt(key, value).apply()
    }

    fun getString(key: String) : String? {
        return sharedPreferences.getString(key, null)
    }
    fun getInt(key: String) : Int {
        return sharedPreferences.getString(key, null)
    }
    fun getString(key: String) : String? {
        return sharedPreferences.getString(key, null)
    }

}