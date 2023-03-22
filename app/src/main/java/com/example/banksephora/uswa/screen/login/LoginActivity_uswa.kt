package com.example.banksephora.uswa.screen.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.banksephora.R
import com.example.banksephora.databinding.ActivityLoginUswaBinding
import com.example.banksephora.uswa.screen.login.LoginInterface
import com.example.banksephora.uswa.screen.login.LoginPresenter
import com.example.banksephora.uswa.shared.ui.showDialog
import com.example.banksephora.uswa.shared.ui.showDialog
import com.example.banksephora.uswa.shared.ui.showDialog2

class LoginActivity_uswa : AppCompatActivity() , LoginInterface {

    private lateinit var presenter: LoginPresenter

    private lateinit var binding : ActivityLoginUswaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginUswaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onAttach()
        initView()

//        binding.masuk.setOnClickListener{
////            showDialog("Selamat! Akun Anda telah berhasil \n" +
////                "terdaftar di akun Sephora Banking. \n" +
////                "Silakan menikmati semua fitur Sephora Banking.")
//
//
//
//        }


    }

    override fun onAttach() {
        presenter = LoginPresenter(this)
        presenter.onAttach(this)
    }


    override fun onDetach() {
        presenter.onDetach()
    }

    override fun onSuccessLogin() {
        showDialog("Selamat! Akun Anda telah berhasil \n" +
                "terdaftar di akun Sephora Banking. \n" +
                "Silakan menikmati semua fitur Sephora Banking.")

    }

    override fun onFailedLogin(message: String) {
        showDialog2(message)

    }

    fun initView(){
//        binding.editUsername.setUsername()
//        binding.editPassword.setPassword()

        binding.editUsername.setPlaceholder("Username")
        binding.editUsername.setTypePassword()
        binding.editPassword.setPlaceholder("Password")
        binding.editPassword.setTypePassword(true)
        binding.masuk.setOnClickListener{
            presenter.login(binding.editUsername.getEditText().text.toString(), binding.editPassword.getEditText().text.toString())
        }
//        showDialog("Selamat! Akun Anda telah berhasil \n" +
//                "terdaftar di akun Sephora Banking. \n" +
//                "Silakan menikmati semua fitur Sephora Banking.")
    }

}