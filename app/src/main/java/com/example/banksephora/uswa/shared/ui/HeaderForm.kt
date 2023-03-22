package com.example.banksephora.uswa.shared.ui

import android.content.Context
import android.text.InputType
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.EditText
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.banksephora.R
import com.example.banksephora.databinding.ItemInputformUswaBinding


class HeaderForm : ConstraintLayout {
    private lateinit var mContext: Context
    private lateinit var binding: ItemInputformUswaBinding

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

        binding = ItemInputformUswaBinding.bind(LayoutInflater.from(mContext).inflate(R.layout.item_inputform_uswa , this, true))
    }

    fun setUsername() {
        binding.idedit.setText("Username")
        binding.idimage.setVisibility(GONE);
    }

    fun setPassword() {
        binding.idedit.setText("Password")
        binding.idimage.setVisibility(VISIBLE);
    }


    fun setPlaceholder(text:String){
        binding.idedit.hint = text
    }

    fun setTypePassword(isPassword: Boolean = false ){
        if (isPassword){
            binding.idedit.setInputType(InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD)

            //binding.editText.inputType = InputType.TYPE_TEXT_VARIATION_PASSWORD
            binding.idimage.setOnClickListener{
                if (isHiddenPass) {
                    binding.idedit.transformationMethod = HideReturnsTransformationMethod.getInstance()
                    isHiddenPass = false
                    binding.idimage.setImageDrawable(resources.getDrawable(R.drawable.ic_eye))
                }else {
                    binding.idedit.transformationMethod = PasswordTransformationMethod.getInstance()
                    isHiddenPass = true
                    binding.idimage.setImageDrawable(resources.getDrawable(R.drawable.ic_eye))
                }
            }
        }else{
            binding.idimage.visibility = GONE
        }
    }

    fun getEditText() : EditText {
        return binding.idedit
    }
}