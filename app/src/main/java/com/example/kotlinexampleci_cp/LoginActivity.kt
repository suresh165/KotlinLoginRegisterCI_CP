package com.example.kotlinexampleci_cp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinexampleci_cp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding:ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}