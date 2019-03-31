package com.mjie.base

fun main(args: Array<String>) {
    sayHello("张三")
    val result = defaultResult()
    println("result = $result")

    println("---------------------------")

    val calculate = calculate(1, 2)
    if (calculate == null) {
        println("get null from calculate")
    }

    println("----------------------------")
    val multiply = multiply(2, 4)
    println("multiply = $multiply")
}

fun sayHello(name: String): Unit {
    println("hello $name")
}

fun defaultResult(): Int = 10

fun calculate(a: Int, b: Int): Int? {
    if (a == 1)
        return null
    return a + b
}

fun multiply(a: Int, b: Int): Int {
    return a * b
}
