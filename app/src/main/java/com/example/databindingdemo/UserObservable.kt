package com.example.databindingdemo

import android.util.Log
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import java.util.Observable;

class UserObservable : BaseObservable() {

    @get:Bindable
    var firstName: String = ""
        set(value) {
            field = value
            Log.e("UserObservable", value)
            notifyPropertyChanged(BR.firstName)
        }

    @get:Bindable
    var lastName: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.lastName)
        }
}