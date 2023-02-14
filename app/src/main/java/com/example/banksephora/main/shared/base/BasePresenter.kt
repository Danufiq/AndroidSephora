package com.example.banksephora.main.shared.base

interface BasePresenter<in T : BaseView> {
    fun onAttach(view: T)

    fun onDetach()
}