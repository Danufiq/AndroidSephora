package com.example.banksephora.main.screen.login

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.banksephora.R
import com.example.banksephora.databinding.ActivityLoginBinding
import com.example.banksephora.main.shared.ui.showDialog

class LoginActivity : AppCompatActivity() {
    private lateinit var binding : ActivityLoginBinding
    companion object {
        fun newIntent(context: Context) : Intent {
            val intent = Intent(context, LoginActivity::class.java)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()


    }

    fun initView(){
        binding.header.setTitle("BANK sephora test")
        showDialog("test Dialog")
    }


}