package com.example.banksephora.gabriel.model.networking

import java.net.CacheResponse

interface DelegateAPIRequestGab {
    fun onCallSuccess (response: String)
}