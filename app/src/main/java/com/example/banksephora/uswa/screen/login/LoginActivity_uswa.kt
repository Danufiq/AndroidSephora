package com.example.banksephora.uswa.screen.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.banksephora.R
import com.example.banksephora.databinding.ActivityLoginUswaBinding
import com.example.banksephora.uswa.shared.ui.showDialog

class LoginActivity_uswa : AppCompatActivity() {

    private lateinit var binding : ActivityLoginUswaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginUswaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()

        binding.masuk.setOnClickListener{
            showDialog("Selamat! Akun Anda telah berhasil \n" +
                "terdaftar di akun Sephora Banking. \n" +
                "Silakan menikmati semua fitur Sephora Banking.")
        }

    }

    fun initView(){
        binding.editUsername.setUsername()
        binding.editPassword.setPassword()
//        showDialog("Selamat! Akun Anda telah berhasil \n" +
//                "terdaftar di akun Sephora Banking. \n" +
//                "Silakan menikmati semua fitur Sephora Banking.")
    }

}