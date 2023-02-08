package com.example.banksephora.main.shared.ui

import android.app.Activity
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.Window
import com.example.banksephora.R
import com.example.banksephora.databinding.DialogGeneralBinding

fun Activity.showDialog(message: String) {
    // custom dialog
    val dialog = Dialog(this, R.style.DialogSlideAnimFullWidth)
    val binding = DialogGeneralBinding.bind(layoutInflater.inflate(R.layout.dialog_general, null))
    dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
    dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    dialog.setContentView(binding.root)

    binding.textView4.text = message

    binding.btn.setOnClickListener{
        dialog.dismiss()
    }

   dialog.show()
}