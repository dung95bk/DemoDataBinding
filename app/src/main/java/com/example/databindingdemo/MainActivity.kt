package com.example.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var  binding : ActivityMainBinding? = null
    var user: User? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding   = DataBindingUtil.setContentView(this, R.layout.activity_main)
        user = User("das",lastName =  "Dsad")
        val userObservable = UserObservable()
        binding?.user = user
        abc()
    }

    override fun onResume() {
        super.onResume()
        user?.firstName = System.currentTimeMillis().toString()
        abc()
    }

    fun abc() {
        val binding1: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)

    }
}