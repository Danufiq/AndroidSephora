package com.example.banksephora.gabriel.screen.exampleonboarding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.banksephora.R
import com.example.banksephora.databinding.ActivityOnBoardingGabbLoginBinding

class OnBoardingGabbLoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOnBoardingGabbLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoardingGabbLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}