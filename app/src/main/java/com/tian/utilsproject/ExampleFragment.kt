package com.tian.utilsproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * @author: TXZ
 * @version: 1.0
 * @date: created by 2023/11/12 23:06
 */
class ExampleFragment : Fragment(R.layout.fragment_example) {
    private var orderId by argument<Int>()
    private var orderType: Int by argument()

    companion object {
        fun newInstance(id: Int, type: Int): ExampleFragment {
            return ExampleFragment().apply {
                this.orderId = id
                this.orderType = type
            }
        }
    }
}

//class Argument<T> : ReadWriteProperty<Fragment, T> {
//    override fun getValue(thisRef: Fragment, property: KProperty<*>): T {
//        return thisRef.arguments?.(property.name) as T
//            ?: throw IllegalStateException("Property ${property.name} could not be read")
//    }
//
//    override fun setValue(thisRef: Fragment, property: KProperty<*>, value: T) {
//
//    }
//
//}
