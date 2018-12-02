package com.mjie.lambda

//在默认情况下，lambda表达式中最后一个表达式的值会隐式作为该lambda表达式的返回值
//我们可以通过全限定的return语法来显示从lambda表达式返回值

fun main(args: Array<String>) {
    val str = arrayOf("hello", "world", "welcome")

    str.filter {
        val fil = it.length > 3
        fil
    }

    str.filter {
        val fil = it.length > 3
        return@filter fil
    }
}