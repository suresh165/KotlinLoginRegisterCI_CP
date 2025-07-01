package com.example.kotlinexampleci_cp.MVVM

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotlinexampleci_cp.Database.UserModel
import com.example.kotlinexampleci_cp.Database.UserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(private val userRepository: UserRepository):ViewModel() {
    fun getUser() : LiveData<List<UserModel>> {
        return userRepository.getUser()
    }

    fun insertUser(userModel: UserModel){
        viewModelScope.launch(Dispatchers.IO){
            userRepository.insertUser(userModel)
        }

    }
}