package com.example.kotlinexampleci_cp.Helper

import android.content.Context
import com.example.kotlinexampleci_cp.databinding.ActivityLoginBinding

class Validation (val context: Context) {
    //login Validation
    fun login(binding: ActivityLoginBinding):Boolean {
        if (binding.editTextMobile.text.isEmpty()){
            binding.editTextMobile.error = "Required *"
            return false
        }
        if (binding.editTextPassword.text.isEmpty()){
            binding.editTextPassword.error = "Required *"
            return false
        }
        return true
    }

}