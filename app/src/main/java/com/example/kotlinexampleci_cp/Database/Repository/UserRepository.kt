package com.example.kotlinexampleci_cp.Database.Repository

import androidx.lifecycle.LiveData
import com.example.kotlinexampleci_cp.Database.UserDao
import com.example.kotlinexampleci_cp.Database.UserModel

class UserRepository(private val userDao: UserDao) {
    fun getUser():LiveData<List<UserModel>>{
        return userDao.getUser()
    }
    suspend fun insertUser(userModel: UserModel){
        userDao.insertUser(userModel)
    }
}