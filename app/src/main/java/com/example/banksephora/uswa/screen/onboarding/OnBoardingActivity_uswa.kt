package com.example.banksephora.uswa.screen.onboarding

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.banksephora.R
import com.example.banksephora.databinding.ActivityOnBoardingUswaBinding
import com.example.banksephora.main.screen.onboarding.OnBoardingThreeView
import com.example.banksephora.uswa.screen.login.LoginActivity_uswa

class OnBoardingActivity_uswa : AppCompatActivity() {
    private lateinit var binding: ActivityOnBoardingUswaBinding
    private lateinit var fragmentOnBoardingOne : OnBoardingOneView_uswa
    private lateinit var fragmentOnBoardingTwo : OnBoardingTwoView_uswa
    private lateinit var fragmentOnBoardingThree : OnBoardingThreeView_uswa


    var countFrame = 1
    val ft = supportFragmentManager.beginTransaction()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding_uswa)
        binding = ActivityOnBoardingUswaBinding.inflate(layoutInflater)
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

                    val intent = Intent(this, LoginActivity_uswa ::class.java)
                    // start your next activity
                    startActivity(intent)
                }
            }
        }

        private fun initFragment(){
            fragmentOnBoardingOne = OnBoardingOneView_uswa.newInstance()
            val ft = supportFragmentManager.beginTransaction()
            ft.replace(R.id.frameLayout, fragmentOnBoardingOne)
            ft.commit()
        }

        @SuppressLint("ResourceType")
        private fun nextFragment(){

//            if (countFrame < 4){
                when (countFrame){
                    2 -> {
                        fragmentOnBoardingTwo = OnBoardingTwoView_uswa.newInstance()
                        val ft = supportFragmentManager.beginTransaction()
                        ft.replace(R.id.frameLayout , fragmentOnBoardingTwo)
                        ft.commit()
//                        fragmentOnBoardingOne.binding.imageView1.setImageDrawable(getResources().getDrawable(R.drawable.imagecontent2_1_uswa))
//                        fragmentOnBoardingOne.binding.imageView2.setImageDrawable(getResources().getDrawable(R.drawable.imagecontent2_2_uswa))
//                        fragmentOnBoardingOne.binding.textView1.setText(getResources().getString(R.string.content2_1))
//                        fragmentOnBoardingOne.binding.textView2.setText(getResources().getString(R.string.content2_2))
                    }
                    3 -> {
                        fragmentOnBoardingThree = OnBoardingThreeView_uswa.newInstance()
                        val ft = supportFragmentManager.beginTransaction()
                        ft.replace(R.id.frameLayout, fragmentOnBoardingThree)
                        ft.commit()

//                        fragmentOnBoardingOne.binding.imageView1.setImageDrawable(getResources().getDrawable(R.drawable.imagecontent3_1_uswa))
//                        fragmentOnBoardingOne.binding.imageView2.setImageDrawable(getResources().getDrawable(R.drawable.image_content3_2_uswa))
//                        fragmentOnBoardingOne.binding.textView1.setText(getResources().getString(R.string.content3_1))
//                        fragmentOnBoardingOne.binding.textView2.setText(getResources().getString(R.string.content3_2))

                        binding.btnNext.setText("LOGIN")
                    }
//                    else -> { Log.d("OnBoardingActivity_uswa","else")}
                }
//            }


        }
}