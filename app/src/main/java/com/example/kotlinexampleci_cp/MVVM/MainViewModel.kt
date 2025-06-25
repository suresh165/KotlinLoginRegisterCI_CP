package com.example.kotlinexampleci_cp.MVVM

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.kotlinexampleci_cp.Database.Repository.UserRepository
import com.example.kotlinexampleci_cp.Database.UserModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel (private val repository: UserRepository) :ViewModel() {
    fun getUser():LiveData<List<UserModel>>{
        return repository.getUser()
    }
    fun insertUser(userModel: UserModel){
        viewModelScope.launch(Dispatchers.IO) {
            repository.insertUser(userModel)
        }
    }
}