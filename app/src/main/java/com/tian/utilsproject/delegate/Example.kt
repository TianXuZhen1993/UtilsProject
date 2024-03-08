package com.tian.utilsproject.delegate

import java.lang.Exception

/**
 *
 *
 * @author TXZ
 * @version 1.0
 * created by 2024/3/5 18:10
 */
class Example {
    fun doWork(name: String) {
        println(name)
    }
}

fun main() {
    val kFunction2 = Example::doWork
    kFunction2.call(Example(), "tian")
}