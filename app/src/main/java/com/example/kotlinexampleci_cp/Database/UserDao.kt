package com.example.kotlinexampleci_cp.Database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {
    @Query("SELECT * from users")
    fun getUser():LiveData<List<UserModel>>
    //insertUser
    @Insert
    suspend fun insertUser(userModel: UserModel):Long
}