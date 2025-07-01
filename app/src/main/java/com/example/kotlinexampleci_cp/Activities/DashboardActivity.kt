package com.example.kotlinexampleci_cp.Activities
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.kotlinexampleci_cp.Database.UserDao
import com.example.kotlinexampleci_cp.Database.UserDatabase
import com.example.kotlinexampleci_cp.Database.UserModel
import com.example.kotlinexampleci_cp.Database.UserRepository
import com.example.kotlinexampleci_cp.MVVM.MainViewModel
import com.example.kotlinexampleci_cp.MVVM.MainViewModelFactory
import com.example.kotlinexampleci_cp.databinding.ActivityDashboardBinding
class DashboardActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDashboardBinding
    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val dao = UserDatabase.getDatabase(applicationContext).userDao()
        val  repository = UserRepository(dao)


       mainViewModel = ViewModelProvider(this,MainViewModelFactory(repository))[MainViewModel::class.java]
        mainViewModel.getUser().observe(this, Observer {
            binding.txtText.text = it.toString()
        })

        binding.btnSave.setOnClickListener {
            val quote = UserModel(0, "This is testing", "Testing")
            mainViewModel.insertUser(quote)
        }
    }
}