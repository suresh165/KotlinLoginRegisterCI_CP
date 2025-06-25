package com.example.kotlinexampleci_cp.Database

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName = "users")
data class UserModel(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val username: String,
    val name: String,
    val mobile: String,
    val password: String
) {
}