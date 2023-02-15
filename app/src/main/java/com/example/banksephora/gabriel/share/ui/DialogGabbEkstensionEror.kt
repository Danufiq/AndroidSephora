import android.app.Activity
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.Window
import com.example.banksephora.R
import com.example.banksephora.databinding.DialogFormErorBinding

fun Activity.showDialogEror(pesan: String) {
    // custom dialog
    val dialog = Dialog(this, R.style.DialogSlideAnimFullWidth)
    val binding = DialogFormErorBinding.bind(layoutInflater.inflate(R.layout.dialog_form_eror, null))
    dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
    dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    dialog.setContentView(binding.root)

    binding.kalimatGagal.text = pesan

    binding.tutup.setOnClickListener{
        dialog.dismiss()
    }
    binding.cobaLagi.setOnClickListener{
        dialog.dismiss()
    }
    dialog.show()
}