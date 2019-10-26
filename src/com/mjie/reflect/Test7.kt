package com.mjie.reflect

import kotlin.reflect.jvm.javaField
import kotlin.reflect.jvm.javaGetter


class T(val x: Int)


fun main() {
    println(T::x.javaField)
    println(T::x.javaGetter)

    println("----------")

    println(T(10).javaClass)
    println(T(10).javaClass.kotlin)
}