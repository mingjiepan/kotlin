package com.mjie.lambda

fun myCalculate(a: Int, b: Int, calculate: (Int, Int) -> Int): Int {
    return calculate(a, b)
}

fun main(args: Array<String>) {
    var result = myCalculate(2, 2) { a, b -> a + b }

    println(result)
    result = myCalculate(2, 2) { a, b -> a / b }
    println(result)

    result = myCalculate(3, 2) { a, b -> a - b }
    println(result)

    result = myCalculate(3, 2) { a, b -> a * b }
    println(result)
}