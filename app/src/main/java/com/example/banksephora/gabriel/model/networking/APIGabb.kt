package com.example.banksephora.gabriel.model.networking

import android.content.Context
import com.example.banksephora.gabriel.model.User
import com.example.banksephora.gabriel.share.constant.BaseURLGabb
import com.example.banksephora.gabriel.share.constant.EndpointGabb
import com.example.banksephora.main.shared.constant.BaseURL
import com.example.banksephora.main.shared.constant.Endpoint
import com.google.gson.Gson
import org.json.JSONObject

class APIGabb (val context: Context){
    private val apiClient: APIClientGabb = APIClientGabb(context)

    fun restLogin (callBack: (User) -> Unit){
        var url = BaseURL.URL + Endpoint.LOGIN
        val jsonParam = JSONObject()
        apiClient.callRequestAPI(url, jsonParam, object : DelegateAPIRequestGab{
            override fun onCallSuccess(response: String) {
                var user = Gson().fromJson(response, User::class.java)
                callBack(user)
            }
        })
    }
}