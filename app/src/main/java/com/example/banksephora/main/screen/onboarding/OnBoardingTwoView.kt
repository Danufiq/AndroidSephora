package com.example.banksephora.main.screen.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.banksephora.R
import com.example.banksephora.databinding.FragmentOnBoardingOneViewBinding
import com.example.banksephora.databinding.FragmentOnBoardingTwoViewBinding


class OnBoardingTwoView : Fragment() {
    private lateinit var binding: FragmentOnBoardingTwoViewBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnBoardingTwoViewBinding.bind(inflater.inflate(R.layout.fragment_on_boarding_two_view, container, false))

        return binding.root
    }

    companion object {
        fun newInstance(): OnBoardingTwoView {
            val fragment = OnBoardingTwoView()
            val bundle = Bundle()
            fragment.arguments = bundle
            return fragment
        }

    }
}