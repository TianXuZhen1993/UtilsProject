package com.tian.utilsproject

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 *
 *
 * @author TXZ
 * @version 1.0
 * created by 2024/3/5 19:57
 */
class DelegateTrim : ReadWriteProperty<Any, String> {
    private var _stringTrim = ""

    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        return _stringTrim
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        _stringTrim = value.trim()
    }
}

