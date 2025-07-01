package com.example.kotlinexampleci_cp.Database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class UserModel(
    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val text: String,
    val author: String
)
