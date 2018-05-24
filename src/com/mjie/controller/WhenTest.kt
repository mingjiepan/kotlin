package com.mjie.controller

fun main(args: Array<String>) {
    println(getStr("hello"))
    println(getStr2("world"))
    println(getStr2("welcome"))


    println("-------------------")


    var a = 4

    var result = when (a) {
        1 -> 4
        2 -> {
            println("a is a")
            2 * a
        }
        3, 4, 5 -> {
            5 * a
        }

        in 6..10 -> 10 * a

        else -> 0
    }
    println(result)
}

fun getStr(str: String): String {
    when (str) {
        "hello" -> return "HELLO"
        "world" -> return "WORLD"
        "hello world" -> return "HELLO WORLD"
        else -> return "other input"
    }
}

fun getStr2(str: String): String {
    return when (str) {
        "hello" ->  "HELLO"
        "world" ->  "WORLD"
        "hello world" ->  "HELLO WORLD"
        else ->  "other input"
    }
}

fun getStr3(str: String): String = when (str) {
        "hello" ->  "HELLO"
        "world" ->  "WORLD"
        "hello world" ->  "HELLO WORLD"
        else ->  "other input"
}
