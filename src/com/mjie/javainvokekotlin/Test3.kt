package com.mjie.javainvokekotlin

class MyClass1 {
    val a: Int
        @JvmName("getAValue")
        get() = 20

    fun getA() = 10
}