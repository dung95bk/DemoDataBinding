package com.example.databindingdemo

import android.content.Context
import android.view.View

data class User( var firstName: String? = null, val lastName: String) {
    fun acb(context: Context) : Boolean{
        return true
    }
}
