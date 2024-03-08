package com.tian.utilsproject

import com.tian.utilsproject.delegate.Delegate

/**
 *
 *
 * @author TXZ
 * @version 1.0
 * created by 2024/3/5 20:00
 */
class User {
    fun doWork(name: String) {
        println(name)
    }
}

fun main() {
    val kFunction2 = User::doWork
}