package com.example.kotlinexampleci_cp.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import com.example.kotlinexampleci_cp.Helper.Validation
import com.example.kotlinexampleci_cp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding:ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnLogin.setOnClickListener {
            login()
        }
        binding.btnCreateAccount.setOnClickListener {
            startActivity(Intent(this@LoginActivity, RegistrationActivity::class.java))
        }
        binding.chkPassword.setOnCheckedChangeListener{ _, isChecked ->
            if (isChecked) {
                binding.editTextPassword.transformationMethod = HideReturnsTransformationMethod.getInstance()
            } else {
                binding.editTextPassword.transformationMethod = PasswordTransformationMethod.getInstance()
            }
        }
    }
    private fun login() {
        val validation = Validation(this)
        if (validation.login(binding)) {
            startActivity(Intent(this@LoginActivity,DashboardActivity::class.java))
            finish()
        }else{

        }
    }
}