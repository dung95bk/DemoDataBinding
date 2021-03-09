package com.example.databindingdemo

import android.content.Context
import android.util.Log
import android.view.View
import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt

data class User( var firstName: String? = null, val lastName: String) {
    var textVisible : ObservableField<String> =  ObservableField("đasa")

    fun acb(context: Context) : Boolean{
        return true
    }
}
