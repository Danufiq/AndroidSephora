package com.example.banksephora.main.screen.onboarding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.banksephora.R
import com.example.banksephora.databinding.ActivityMainBinding
import com.example.banksephora.databinding.ActivityOnBoardingBinding

class OnBoardingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOnBoardingBinding
    private lateinit var fragmentOnBoardingOne : OnBoardingOneView
    private lateinit var fragmentOnBoardingTwo : OnBoardingTwoView
    private lateinit var fragmentOnBoardingThree : OnBoardingThreeView

    var countFrame = 1
    val ft = supportFragmentManager.beginTransaction()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoardingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
        initFragment()
    }

    private fun initView(){
        binding.btnNext.setOnClickListener{
            if (countFrame < 4) {
                countFrame = countFrame+1
                this.nextFragment()
            }else {
                Log.d("","next Screen")
            }
        }
    }

    private fun initFragment(){
        fragmentOnBoardingOne = OnBoardingOneView.newInstance()
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.frameLayout, fragmentOnBoardingOne)
        ft.commit()
    }

    private fun nextFragment(){

        if (countFrame < 4){
            when (countFrame){
                2 -> {
                    fragmentOnBoardingTwo = OnBoardingTwoView.newInstance()
                    val ft = supportFragmentManager.beginTransaction()
                    ft.replace(R.id.frameLayout, fragmentOnBoardingTwo)
                    ft.commit()
                }
                3 -> {
                    fragmentOnBoardingThree = OnBoardingThreeView.newInstance()
                    val ft = supportFragmentManager.beginTransaction()
                    ft.replace(R.id.frameLayout, fragmentOnBoardingTwo)
                    ft.commit()
                    binding.btnNext.setText("LOGIN")
                }
                else -> { Log.d("OnBoardingActivity","else")}
            }
        }


    }
}