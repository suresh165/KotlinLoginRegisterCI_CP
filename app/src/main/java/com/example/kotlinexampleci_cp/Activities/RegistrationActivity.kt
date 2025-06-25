package com.example.kotlinexampleci_cp.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.UserData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.kotlinexampleci_cp.Database.Repository.UserRepository
import com.example.kotlinexampleci_cp.Database.UserDao
import com.example.kotlinexampleci_cp.Database.UserDatabase
import com.example.kotlinexampleci_cp.Database.UserModel
import com.example.kotlinexampleci_cp.MVVM.MainViewModel
import com.example.kotlinexampleci_cp.MVVM.MainViewModelFactory
import com.example.kotlinexampleci_cp.databinding.ActivityRegistrationBinding

class RegistrationActivity : AppCompatActivity() {
    private lateinit var binding:ActivityRegistrationBinding
    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dao = UserDatabase.getUserDatabase(this).useDao()
        val repository = UserRepository(dao)
        mainViewModel = ViewModelProvider(this,MainViewModelFactory(repository)).get(MainViewModel::class.java)

//        mainViewModel.getUser().observe(this, Observer {
//            binding.textViewName.text = it.toString()
//        })
        if (binding.editTextName.text.toString().isNotEmpty() || binding.editTextMobile.text.toString().isNotEmpty() || binding.editTextMobile.text.toString().isNotEmpty()){
            val userModel = UserModel(
                0,
                binding.editTextUsername.text.toString().trim(),
                binding.editTextName.text.toString().trim(),
                binding.editTextMobile.text.toString().trim(),
                binding.editTextPassword.text.toString().trim(),
            )
            mainViewModel.insertUser(userModel)
        }
    }
}