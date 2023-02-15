package com.example.banksephora.main.shared.ui

import android.content.Context
import android.text.InputType
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.banksephora.R
import com.example.banksephora.databinding.ItemGeneralEditTextBinding


class GeneralEditTextView : ConstraintLayout {

    private lateinit var mContext: Context
    private lateinit var binding: ItemGeneralEditTextBinding

    var isHiddenPass = false

    constructor(context: Context) : super(context) {
        init(context, null)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init(context, attrs)
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init(context, attrs)
    }

    private fun init(context: Context, attributeSet: AttributeSet?) {
        mContext = context

        binding = ItemGeneralEditTextBinding.bind(LayoutInflater.from(mContext).inflate(R.layout.item_general_edit_text, this, true))
    }

    fun setPlaceholder(text:String){
        binding.editText.hint = text
    }

    fun setTypePassword(isPassword: Boolean = false ){
        if (isPassword){
            binding.editText.setInputType(InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD)

            //binding.editText.inputType = InputType.TYPE_TEXT_VARIATION_PASSWORD
            binding.imgView.setOnClickListener{
                if (isHiddenPass) {
                    binding.editText.transformationMethod = HideReturnsTransformationMethod.getInstance()
                    isHiddenPass = false
                    binding.imgView.setImageDrawable(resources.getDrawable(R.drawable.ic_eye))
                }else {
                    binding.editText.transformationMethod = PasswordTransformationMethod.getInstance()
                    isHiddenPass = true
                    binding.imgView.setImageDrawable(resources.getDrawable(R.drawable.ic_eye))
                }
            }
        }else{
            binding.imgView.visibility = GONE
        }
    }

    fun getEditText() : EditText {
        return binding.editText
    }

    fun getImage() : ImageView {
        return binding.imgView
    }

}