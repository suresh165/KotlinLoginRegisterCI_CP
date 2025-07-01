package com.example.kotlinexampleci_cp.Activities
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.kotlinexampleci_cp.databinding.ActivityRegistrationBinding

class RegistrationActivity : AppCompatActivity() {
    private lateinit var binding:ActivityRegistrationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            if (binding.editTextUsername.text.isNotEmpty() ||
                binding.editTextName.text.isNotEmpty()||
                binding.editTextMobile.text.isNotEmpty() ||
                binding.editTextPassword.text.isNotEmpty()) {
                //insertUser()
            }else{
                Toast.makeText(this@RegistrationActivity,"All Fields are required * ",Toast.LENGTH_SHORT).show()
            }
        }

    }

}