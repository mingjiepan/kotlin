package com.mjie.function


fun method(a: Int, b:Int = 10) {
    println("a = $a, b = $b")
}

fun method2(a: Int = 1, b: Int) {
    println("a = $a, b = $b")
}

fun method3(a: Int = 1, b: Int = 3) {
    println("a= $a, b = $b")
}

fun main() {
    method(2)
    method2(b = 10)
    method3(a = 1, b = 3)
}