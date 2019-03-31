package com.mjie.exception

import java.lang.IllegalArgumentException

/*
throw 在kotlin中是个表达式，这样我们可以将throw作为Elvis表达式的一部分
throw 表达式的类型是一种特殊的类型：Nothing（没有值，永远不会触达的代码位置）。
在自己的代码中，可以使用nothing来标记永远不会返回的函数
 */
fun main(args: Array<String>) {
    val str: String? = "a"
    val str2 = str ?: throw IllegalArgumentException("值不能为空")
    println(str2)
    println("------------")

    val str3 = str ?: myMethod("hello")
    println(str3)
    println("------------")

    val str4 = null
    println(str4 is Nothing?)
    println("------------")

    val str5 = listOf(null)
    println(str5 is List<Nothing?>)
}

fun myMethod(message: String): Nothing {
    throw IllegalArgumentException(message)
}