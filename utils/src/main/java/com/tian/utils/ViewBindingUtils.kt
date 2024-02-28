package com.tian.utils

import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ViewDataBinding
import androidx.viewbinding.ViewBinding


/**
 * @Function ViewBinding 扩展函数
 *
 * @author TXZ
 * @version 1.0
 * created by 2024/1/4 17:03
 */


/**
 * TODO 不使用反射的代码如下,将inflate函数作为参数传递
 *
 * @param VB
 * @param inflate
 */
fun <VB : ViewBinding> AppCompatActivity.binding(inflate: (LayoutInflater) -> VB) = lazy {
    inflate(layoutInflater).also { binding ->
        if (binding is ViewDataBinding) binding.lifecycleOwner = this
    }
}


/**
 * TODO 使用反射获取inflate方法
 *
 * @param VB
 */
inline fun <reified VB : ViewBinding> AppCompatActivity.inflate() = lazy {
    inflateBinding<VB>(layoutInflater).also { binding ->
        if (binding is ViewDataBinding) binding.lifecycleOwner = this
    }
}

/**
 * TODO 获取 inflate 方法的反射，然后塞入Activity 的 layoutInflater
 *
 * @param VB
 * @param layoutInflater
 */
inline fun <reified VB : ViewBinding> inflateBinding(layoutInflater: LayoutInflater) =
    VB::class.java.getMethod("inflate", LayoutInflater::class.java)
        .invoke(null, layoutInflater) as VB
