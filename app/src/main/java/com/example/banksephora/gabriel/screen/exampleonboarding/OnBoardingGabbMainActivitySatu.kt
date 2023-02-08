package com.example.banksephora.gabriel.screen.exampleonboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.banksephora.R
import com.example.banksephora.databinding.FragmentOnBoardingGabbMainActivitySatuBinding
import com.example.banksephora.databinding.FragmentOnBoardingOneViewBinding
import com.example.banksephora.main.screen.onboarding.OnBoardingOneView

class OnBoardingGabbMainActivitySatu : Fragment() {
    private lateinit var binding: FragmentOnBoardingGabbMainActivitySatuBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOnBoardingGabbMainActivitySatuBinding.bind(inflater.inflate(R.layout.fragment_on_boarding_gabb_main_activity_satu, container, false))

        initView()
        return binding.root
    }

    companion object {
        fun newInstance(): OnBoardingGabbMainActivitySatu {
            val fragment = OnBoardingGabbMainActivitySatu()
            val bundle = Bundle()
            fragment.arguments = bundle
            return fragment
        }
    }

    fun initView(){}
}