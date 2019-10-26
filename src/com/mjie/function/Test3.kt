package com.mjie.function

/*
    可变参数
 */
fun test6(vararg strings: String) {
    println(strings.javaClass)
    strings.forEach { println(it) }
}

fun main(args: Array<String>) {
    test6("a", "b", "c")

    //可变参数可以借助于spread operator以具名参数的形式传递
    test6(strings = *arrayOf("a", "b"))

    val arrays = arrayOf("a", "b", "c")
}