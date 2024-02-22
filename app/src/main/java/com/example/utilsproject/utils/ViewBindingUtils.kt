package com.example.utilsproject.utils

import android.app.Activity
import android.app.Dialog
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

/**
 * @author: TXZ
 * @version: 1.0
 * @date: created by 2024/1/1 22:34
 */
class ViewBindingUtils {
}

inline fun <reified VB : ViewBinding> Activity.inflate() = lazy {
    inflateBinding<VB>(layoutInflater).apply { setContentView(root) }
}

inline fun <reified VB : ViewBinding> Dialog.inflate() = lazy {
    inflateBinding<VB>(layoutInflater).apply { setContentView(root) }
}

inline fun <reified VB : ViewBinding> AppCompatActivity.inflate() = lazy {
    (VB::class.java.getMethod("inflate", LayoutInflater::class.java).invoke(
        null, layoutInflater
    ) as VB).apply { setContentView(root) }
}

inline fun <reified VB : ViewBinding> inflateBinding(layoutInflater: LayoutInflater) =
    VB::class.java.getMethod("inflate", LayoutInflater::class.java)
        .invoke(null, layoutInflater) as VB