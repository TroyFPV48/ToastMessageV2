package com.example.toastmessage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.toastmessage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main) //create databinding object

        binding.button.setOnClickListener{
            Toast.makeText(applicationContext, "Stop touching me!", Toast.LENGTH_SHORT).show()
        }

    }
}