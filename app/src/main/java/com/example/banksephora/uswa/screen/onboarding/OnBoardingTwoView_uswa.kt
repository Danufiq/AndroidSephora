package com.example.banksephora.uswa.screen.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.banksephora.R
import com.example.banksephora.databinding.FragmentOnBoardingTwoViewUswaBinding


class OnBoardingTwoView_uswa : Fragment() {
    private lateinit var binding: FragmentOnBoardingTwoViewUswaBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOnBoardingTwoViewUswaBinding.bind(
            inflater.inflate(
                R.layout.fragment_on_boarding_two_view_uswa,
                container,
                false
            )
        )

        initView()
        return binding.root
    }



    companion object {
        fun newInstance(): OnBoardingTwoView_uswa {
            val fragment = OnBoardingTwoView_uswa()
            val bundle = Bundle()
            fragment.arguments = bundle
            return fragment
        }
    }

    fun initView() {

    }
}