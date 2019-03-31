package com.mjie.other

import com.mjie.`object`.MyTest.MyObject.a

class MyClass2 @JvmOverloads constructor(x: Int, y: String = "hello") {
    @JvmOverloads
    fun method(a: String, b: String = "world") {
        println("a = $a, b = $b")
    }
}

fun main(args: Array<String>) {
    val myClass2 = MyClass2(12)
    myClass2.method("hello")
}