package com.example.kotlinexampleci_cp.Database

import androidx.lifecycle.LiveData

class UserRepository(private val userDao: UserDao) {

    fun getUser(): LiveData<List<UserModel>> {
        return userDao.getAllUser()
    }

    suspend fun insertUser(userModel: UserModel){
        userDao.insertUser(userModel)
    }
}