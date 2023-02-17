package com.example.banksephora.gabriel.model.networking

import android.content.Context
import android.util.Log
import okhttp3.*
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONObject
import java.io.IOException

class APIClientGabb (val context: Context){
    fun callRequestAPI (url: String, params: JSONObject, delegateAPIRequestGab: DelegateAPIRequestGab){
        val okHttpClient = OkHttpClient()
        val request = Request.Builder()
            .method("POST", params.toString().toRequestBody())
            .url(url)
            .build()

        var call = okHttpClient.newCall(request)
        call.enqueue(object : Callback{
            override fun onFailure(call: Call, e: IOException) {
                Log.d("[PRESENTER]", "Gagal!")
            }

            override fun onResponse(call: Call, response: Response) {
                delegateAPIRequestGab.onCallSuccess("${response.body?.string()}")
            }
        })
    }
}