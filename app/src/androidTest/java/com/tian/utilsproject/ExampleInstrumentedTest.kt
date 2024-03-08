package com.tian.utilsproject

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.tian.utilsproject.delegate.Example
import com.tian.utilsproject.delegate.LogInterfaceImp
import com.tian.utilsproject.delegate.LogUtils

import org.junit.runner.RunWith

import org.junit.Assert.*
import kotlin.properties.Delegates
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

}


fun main() {
    val name: Int by ReadOnlyProperty<Any?, Int> { thisRef, property ->
        println(thisRef)
        200
    }
    println(name)
}