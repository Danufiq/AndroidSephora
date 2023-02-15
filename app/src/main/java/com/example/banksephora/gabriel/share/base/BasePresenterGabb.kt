package com.example.banksephora.gabriel.share.base

interface BasePresenterGabb<in T: BaseViewGabb> {
    fun onAttach(view: T) //Merujuk pada kelas base view gab

    fun onDetach()
}