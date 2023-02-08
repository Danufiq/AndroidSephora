package com.example.banksephora.gabriel.screen.exampleonboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.banksephora.R
import com.example.banksephora.databinding.FragmentOnBoardingGabbMainActivityDuaBinding
import com.example.banksephora.databinding.FragmentOnBoardingGabbMainActivitySatuBinding

class OnBoardingGabbMainActivityDua : Fragment() {
    private lateinit var binding: FragmentOnBoardingGabbMainActivityDuaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOnBoardingGabbMainActivityDuaBinding.bind(inflater.inflate(R.layout.fragment_on_boarding_gabb_main_activity_dua, container, false))

        initView()
        return binding.root
    }

    companion object {
        fun newInstance(): OnBoardingGabbMainActivityDua {
            val fragment = OnBoardingGabbMainActivityDua()
            val bundle = Bundle()
            fragment.arguments = bundle
            return fragment
        }
    }

    fun initView(){}
}