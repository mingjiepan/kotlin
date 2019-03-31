package com.mjie.collection

fun main(args: Array<String>) {
    val items = listOf(1, 2, 3, 4)

    println(items.first())
    println(items.last())

    items.filter { it > 2 }.forEach { println(it) }
    println("---------")

    val noNulls = items.requireNoNulls()
    val none = noNulls.none { it > 2 }
    println(noNulls)
    println(none)
}