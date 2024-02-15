package com.example.initialapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.initialapp.databinding.ActivityMain2Binding
import com.example.initialapp.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}