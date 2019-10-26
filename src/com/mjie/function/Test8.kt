package com.mjie.function


fun myMethod(value: Int): Int {
    return value + 1
}


fun main() {
    val my:(Int) -> Int  = ::myMethod

    val result = my(1)
    println(result)
}