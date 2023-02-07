package com.example.banksephora.uswa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.banksephora.R
import com.example.banksephora.databinding.ActivityOnBoardingBinding
import com.example.banksephora.databinding.ActivityOnBoardingUswaBinding

class OnBoardingActivity_uswa : AppCompatActivity() {
    private lateinit var binding: ActivityOnBoardingUswaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding_uswa)
        binding = ActivityOnBoardingUswaBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}