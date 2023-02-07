package com.example.banksephora.main.screen.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.banksephora.R
import com.example.banksephora.databinding.FragmentOnBoardingOneViewBinding
import com.example.banksephora.databinding.FragmentOnBoardingThreeViewBinding
import com.example.banksephora.databinding.FragmentOnBoardingTwoViewBinding


class OnBoardingThreeView : Fragment() {
    private lateinit var binding: FragmentOnBoardingThreeViewBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnBoardingThreeViewBinding.bind(inflater.inflate(R.layout.fragment_on_boarding_three_view, container, false))

        return binding.root
    }

    companion object {
        fun newInstance(): OnBoardingThreeView {
            val fragment = OnBoardingThreeView()
            val bundle = Bundle()
            fragment.arguments = bundle
            return fragment
        }
    }
}