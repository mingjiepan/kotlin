package com.mjie.lambda

fun main(args: Array<String>) {
    val str = arrayOf("hello", "world", "welcome", "xiamen")

    str.filter { it.contains("h") }.forEach { println(it) }

    println("-----")

    str.filter { it.length >= 7 }.forEach { println(it) }

    println("-------")

    str.filter { it.endsWith("d", ignoreCase = true) }.map { it.toUpperCase() }.forEach { it }
}