package com.tian.utilsproject.delegate

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 *
 *
 * @author TXZ
 * @version 1.0
 * created by 2024/3/5 17:27
 */
class Delegate:ReadWriteProperty<Any,String> {
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
       return "tian"
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {

    }

}