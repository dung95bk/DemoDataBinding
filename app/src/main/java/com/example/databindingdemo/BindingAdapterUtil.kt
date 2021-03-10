package com.example.databindingdemo

import android.animation.LayoutTransition
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.view.ViewGroup
import androidx.databinding.BindingAdapter
import androidx.databinding.BindingConversion


@BindingConversion
//giúp thuộc tính có thể nhận nhiều kiểu tham số khác nhau
fun convertColorToDrawable(color: Int): Drawable? {
    return ColorDrawable(color)
}

