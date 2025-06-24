package com.example.kotlinexampleci_cp.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinexampleci_cp.R
import com.example.kotlinexampleci_cp.databinding.ActivityDashboardBinding

class DashboardActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}