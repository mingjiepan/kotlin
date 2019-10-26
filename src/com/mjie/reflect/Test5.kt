package com.mjie.reflect

/**
 * 当访问一个类的成员时，需要使用全限定名称
 */
fun main() {
    val values = listOf("a", "bb", "abc")

    println(values.map { it.length })
    println(values.map(String::length))
    println(values.map { String::length })

    println("-------")

    val x = MyClass::x
    println(x.get(MyClass(10)))
}

class MyClass(val x: Int)