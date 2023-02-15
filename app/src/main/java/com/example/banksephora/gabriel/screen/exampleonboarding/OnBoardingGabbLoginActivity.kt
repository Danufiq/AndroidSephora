package com.example.banksephora.gabriel.screen.exampleonboarding

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.banksephora.databinding.ActivityOnBoardingGabbLoginBinding
import showDialogEror
import showDialogSukses

class OnBoardingGabbLoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOnBoardingGabbLoginBinding
    companion object {
        fun newIntent(context: Context) : Intent {
            val intent = Intent(context, ActivityOnBoardingGabbLoginBinding::class.java)
            return intent
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoardingGabbLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    fun init (){
        binding.username.setHint("Username")
        binding.username.setTipeInput()
        binding.password.setHint("Password")
        binding.password.setTipeInput(true)
        showDialogSukses()
        binding.loginButton.setOnClickListener { showDialogEror() }
    }
}