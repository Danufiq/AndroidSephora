package com.example.banksephora.main.screen.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.banksephora.R
import com.example.banksephora.databinding.ActivityOnBoardingBinding
import com.example.banksephora.databinding.FragmentOnBoardingOneViewBinding
import java.util.zip.Inflater


class OnBoardingOneView : Fragment() {
    private lateinit var binding: FragmentOnBoardingOneViewBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOnBoardingOneViewBinding.bind(inflater.inflate(R.layout.fragment_on_boarding_one_view, container, false))

        initView()
        return binding.root
    }

    companion object {
        fun newInstance(): OnBoardingOneView {
            val fragment = OnBoardingOneView()
            val bundle = Bundle()
            fragment.arguments = bundle
            return fragment
        }
    }

    fun initView(){

    }
}