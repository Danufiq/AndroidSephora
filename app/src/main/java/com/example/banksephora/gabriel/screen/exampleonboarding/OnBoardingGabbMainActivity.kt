package com.example.banksephora.gabriel.screen.exampleonboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.banksephora.R
import com.example.banksephora.databinding.ActivityOnBoardingBinding
import com.example.banksephora.databinding.ActivityOnBoardingGabbMainBinding
import com.example.banksephora.main.screen.onboarding.OnBoardingOneView
import com.example.banksephora.main.screen.onboarding.OnBoardingThreeView
import com.example.banksephora.main.screen.onboarding.OnBoardingTwoView

class OnBoardingGabbMainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOnBoardingGabbMainBinding
    private lateinit var fragmentOnBoardingSatu : OnBoardingGabbMainActivitySatu
    private lateinit var fragmentOnBoardingDua : OnBoardingGabbMainActivityDua
    private lateinit var fragmentOnBoardingTiga : OnBoardingGabbMainActivityTiga

    var countFrame = 1
    val ft = supportFragmentManager.beginTransaction()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoardingGabbMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
        initFragment()
    }

    private fun initView(){
        binding.btnNext.setOnClickListener{
            if (countFrame <= 2) {
                countFrame = countFrame+1
                this.nextFragment()
            }else {
                startActivity(Intent(this, OnBoardingGabbLoginActivity::class.java))
                Log.d("[SCREEN]","Login Button")
            }
        }
    }

    private fun initFragment(){
        fragmentOnBoardingSatu = OnBoardingGabbMainActivitySatu.newInstance()
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.frameLayout, fragmentOnBoardingSatu)
        ft.commit()
    }

    private fun nextFragment(){
        if (countFrame < 4){
            when (countFrame){
                2 -> {
                    fragmentOnBoardingDua = OnBoardingGabbMainActivityDua.newInstance()
                    val ft = supportFragmentManager.beginTransaction()
                    ft.replace(R.id.frameLayout, fragmentOnBoardingDua)
                    ft.commit()
                }
                3 -> {
                    fragmentOnBoardingTiga = OnBoardingGabbMainActivityTiga.newInstance()
                    val ft = supportFragmentManager.beginTransaction()
                    ft.replace(R.id.frameLayout, fragmentOnBoardingTiga)
                    ft.commit()
                    binding.btnNext.setText("LOGIN")
                }
                else -> {
                    Log.d("OnBoardingActivity","else")
                }
            }
        }
    }
}