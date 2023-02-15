package com.example.banksephora.uswa.shared.ui

import android.app.Activity
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.hardware.camera2.params.BlackLevelPattern
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
    binding.btnTutup.setVisibility(View.GONE)
    binding.btnCobaLagi.setVisibility(View.GONE)

    binding.btn.setOnClickListener{
        dialog.dismiss()

    }
    dialog.show()

}

fun Activity.showDialog2(message: String) {
    // custom dialog
    val dialog = Dialog(this, R.style.DialogSlideAnimFullWidth)
    val binding = DialogsucsessUswaBinding.bind(layoutInflater.inflate(R.layout.dialogsucsess_uswa, null))
    dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
    dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    dialog.setContentView(binding.root)

    binding.textviewsuccess.text = message
    binding.titledialog.setText("Gagal!")
    binding.titleimage.setImageDrawable(getResources().getDrawable(R.drawable.x_uswa))
    binding.btn.setVisibility(View.GONE)
    binding.btnTutup.setVisibility(View.VISIBLE)
    binding.btnCobaLagi.setVisibility(View.VISIBLE)
    binding.btnTutup.setBackgroundDrawable(ColorDrawable(Color.WHITE))
    binding.btnTutup.setTextColor(Color.BLACK)

    binding.btnTutup.setOnClickListener{
        dialog.dismiss()
    }

    binding.btnCobaLagi.setOnClickListener{
        dialog.dismiss()
    }

    dialog.show()

}