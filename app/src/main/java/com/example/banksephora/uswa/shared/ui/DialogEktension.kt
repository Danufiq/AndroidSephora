package com.example.banksephora.uswa.shared.ui

import android.app.Activity
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.View
import android.view.Window
import com.example.banksephora.R
import com.example.banksephora.databinding.DialogGeneralBinding
import com.example.banksephora.databinding.DialogsucsessUswaBinding
import com.example.banksephora.uswa.shared.ui.showDialog

fun Activity.showDialog(message: String) {
    // custom dialog
    val dialog = Dialog(this, R.style.DialogSlideAnimFullWidth)
    val binding = DialogsucsessUswaBinding.bind(layoutInflater.inflate(R.layout.dialogsucsess_uswa, null))
    dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
    dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    dialog.setContentView(binding.root)

    binding.textviewsuccess.text = message
    binding.btnGagal.setVisibility(View.GONE)


    binding.btn.setOnClickListener{
        //dialog.dismiss()
        showDialog2()
//        binding.titledialog.setText("Gagal!")
//        binding.titleimage.setImageDrawable(getResources().getDrawable(R.drawable.x_uswa))
//        showDialog("Akun Anda gagal terdaftar di akun Sephora Banking. Silakan coba lagi.")
//        dialog.show()
    }
    dialog.show()

}

fun Activity.showDialog2() {
    // custom dialog
    val dialog = Dialog(this, R.style.DialogSlideAnimFullWidth)
    val binding = DialogsucsessUswaBinding.bind(layoutInflater.inflate(R.layout.dialogsucsess_uswa, null))
    dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
    dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    dialog.setContentView(binding.root)

    binding.textviewsuccess.text = "Akun Anda gagal terdaftar di akun Sephora Banking. Silakan coba lagi."
    binding.titledialog.setText("Gagal!")
    binding.titleimage.setImageDrawable(getResources().getDrawable(R.drawable.x_uswa))
    binding.btn.setVisibility(View.GONE)
    binding.btnGagal.setVisibility(View.VISIBLE)

//    binding.btn.setOnClickListener{
//        dialog.dismiss()
//    }
    dialog.show()

}