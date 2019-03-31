package com.mjie.other

class MyClass {
    val a: Int
        @JvmName("getAValue")
        get() = 20

    fun getA() = 30
}

fun main(args: Array<String>) {
    var myClass = MyClass()
    println(myClass.getA())
}