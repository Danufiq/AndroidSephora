import android.app.Activity
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.Window
import com.example.banksephora.R
import com.example.banksephora.databinding.DialogFormSuksesBinding

fun Activity.showDialogSukses() {
    // custom dialog
    val dialog = Dialog(this, R.style.DialogSlideAnimFullWidth)
    val binding = DialogFormSuksesBinding.bind(layoutInflater.inflate(R.layout.dialog_form_sukses, null))
    dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
    dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    dialog.setContentView(binding.root)
    binding.tombolKonfirmasi.setOnClickListener{
        dialog.dismiss()
    }
    dialog.show()
}