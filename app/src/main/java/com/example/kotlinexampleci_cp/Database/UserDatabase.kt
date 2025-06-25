package com.example.kotlinexampleci_cp.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
@Database(entities = [UserModel::class], version = 1)
abstract class UserDatabase :RoomDatabase() {
    abstract fun useDao ():UserDao

    companion object{
        private var INSTANCE: UserDatabase? = null
        fun getUserDatabase(context: Context): UserDatabase {
            if (INSTANCE == null) {
                synchronized(this) {
                    INSTANCE = Room.databaseBuilder(
                        context,
                        UserDatabase::class.java,
                        "user_database"
                    )
                       // .createFromAsset("quotes.db")
                        .build()
                }
            }
            return INSTANCE!!
        }
    }
}