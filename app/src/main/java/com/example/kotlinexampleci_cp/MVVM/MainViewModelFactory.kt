package com.example.kotlinexampleci_cp.MVVM

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.kotlinexampleci_cp.Database.Repository.UserRepository

class MainViewModelFactory (private val repository: UserRepository) :ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }
}