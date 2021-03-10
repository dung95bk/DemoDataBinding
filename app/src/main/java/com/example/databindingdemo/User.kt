package com.example.databindingdemo

import android.content.Context
import android.text.InputType
import android.util.Log
import android.view.View
import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt
import androidx.databinding.adapters.TextViewBindingAdapter

data class User( var firstName: String? = null, val lastName: String) {
    var isColor: Boolean = false
    var inputType: ObservableInt =  ObservableInt(3)
    var testInverseMethod: ObservableInt = ObservableInt(3)
    var textVisible : ObservableField<String> =  ObservableField("2")
        set(value) {
            field = value
            Log.e("DSADA", field.get()?:"")
        }


    var tesstBoolean : ObservableBoolean=  ObservableBoolean(true)
        set(value) {
            Log.e("DSAD1111A", field.get().toString())
            field = value
        }

    fun acb(context: Context) : Boolean{
        return true
    }


    val ccc = object : TextViewBindingAdapter.BeforeTextChanged {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
           Log.e("AAAA", "da")
        }

    }
}
