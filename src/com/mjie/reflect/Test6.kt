package com.mjie.reflect

/**
 * 扩展属性
 */

val String.firstChat: Char
    get() = this[0]


fun main() {
    val str = "hello world"
    println(str.firstChat)

    println("--------------")

    val strReference = String::firstChat
    val result = strReference.get(str)
    println(result)
}