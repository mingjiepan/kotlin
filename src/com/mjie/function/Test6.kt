package com.mjie.function

/*
   内联函数
 */
inline fun calculate(a: Int, b: Int) = a + b

fun main(args: Array<String>) {
    val result = calculate(1, 2)
    println(result)
}




