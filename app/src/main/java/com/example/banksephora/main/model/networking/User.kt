package com.example.banksephora.main.model.networking

import android.os.Parcelable
import com.example.banksephora.main.model.Buku
import kotlinx.parcelize.Parcelize

@Parcelize
class User( var username: String = "", var password: String = ""):Parcelable {

}