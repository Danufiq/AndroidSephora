package com.example.banksephora.uswa.shared.base

import com.example.banksephora.uswa.shared.base.BaseView

interface BasePresenter<in T : BaseView> {
    fun onAttach(view: T)

    fun onDetach()
}