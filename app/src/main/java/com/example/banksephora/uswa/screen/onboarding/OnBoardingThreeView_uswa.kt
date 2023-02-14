package com.example.banksephora.uswa.screen.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.banksephora.R
import com.example.banksephora.databinding.FragmentOnBoardingThreeViewUswaBinding
import com.example.banksephora.databinding.FragmentOnBoardingTwoViewUswaBinding


class OnBoardingThreeView_uswa : Fragment() {
    private lateinit var binding: FragmentOnBoardingThreeViewUswaBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOnBoardingThreeViewUswaBinding.bind(
            inflater.inflate(
                R.layout.fragment_on_boarding_three_view_uswa,
                container,
                false
            )
        )

        initView()
        return binding.root
    }



    companion object {
        fun newInstance(): OnBoardingThreeView_uswa {
            val fragment = OnBoardingThreeView_uswa()
            val bundle = Bundle()
            fragment.arguments = bundle
            return fragment
        }
    }

    fun initView() {

    }
}