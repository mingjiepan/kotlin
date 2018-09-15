package com.mjie.base

fun main(args: Array<String>) {
    var number = 2
    val result = calculate(number)
    println("result = $result")

    println("-----------------------------")

    print("hello")
}


fun calculate(number: Int):Int {
    return when (number) {
        1 -> 1 * 1
        2 -> 2 * 2
        3 -> 3 * 3
        in 4..10 -> 10 * 10
        else -> -1
    }
}


fun print(str:String):Unit {
    when (str) {
        "hello" -> println("hello world")
        else -> println("something else")
    }
}
