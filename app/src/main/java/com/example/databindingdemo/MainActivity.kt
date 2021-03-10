package com.example.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableInt
import com.example.databindingdemo.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_main.view.abc_def

class MainActivity : AppCompatActivity() {
    var  binding : ActivityMainBinding? = null
    var user: User? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding   = DataBindingUtil.setContentView(this, R.layout.activity_main)
        user = User("das",lastName =  "Dsad")
        val userObservable = UserObservable()
        binding?.user = user
        binding?.userObservable = userObservable
        abc()
        abc_def.setOnClickListener {
           user?.testInverseMethod?.set(System.currentTimeMillis().toInt())
            abc_def.setText("đâs")
        }



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