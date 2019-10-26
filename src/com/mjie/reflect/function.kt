package com.mjie.reflect

import kotlin.reflect.full.functions


class MyClass2 {
    fun method1(str: String) {
        println(str)
    }

    fun method2() {
        println("hello world")
    }
}


fun main() {

    val myClass2 = MyClass2()

    val kFunction = MyClass2::class.functions.find { it.name == "method2" }
    kFunction?.call(myClass2)

    println("--------")

    val kFunction1 = MyClass2::class.functions.find { it.name == "method1" }
    kFunction1?.call(myClass2, "厦门")
}