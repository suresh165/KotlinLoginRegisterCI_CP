package com.example.kotlinexampleci_cp.Database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {

    @Query("SELECT * FROM user_table")
    fun getAllUser():LiveData<List<UserModel>>

    @Insert
    suspend fun insertUser(userModel: UserModel)
}