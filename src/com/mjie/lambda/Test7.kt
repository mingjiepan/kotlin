package com.mjie.lambda

/*
    闭包
 */
fun main(args: Array<String>) {
    var str = ""
    val strings = arrayOf("hello", "world")

    strings.filter { it.length > 3 }.forEach {
        str += it
    }
    println(str)
}