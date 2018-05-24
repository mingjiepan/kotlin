package com.mjie.collection

fun main(args: Array<String>) {

    val arr = listOf<String>("hello", "world", "welcome", "tracymcgrady")

    for (item in arr) {
//        println(item)
    }

    println("----------------")

    when  {
        "world" in arr -> println("world in collection")
    }

    println("----------------")

    arr.filter { it.length > 5 }.map { it.toUpperCase() }.sorted().forEach{ println(it)}
}