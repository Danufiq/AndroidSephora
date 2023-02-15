package com.example.banksephora.main.model.networking

interface DelegateAPIRequest {
    fun onCallSuccess(response: String)
}