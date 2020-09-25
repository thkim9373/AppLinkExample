package com.hoony.applinksassistantexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.hoony.applinksassistantexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val action = intent?.action ?: "action is null"
        val data = intent?.data
        val authority = data?.authority

        binding.text.text = "action : $action \n" +
                "data : ${data?.toString() ?: "data is null"} \n" +
                "authority : ${authority ?: "authority is null"}"
    }
}