package com.mjie.collection

fun main(args: Array<String>) {
    //快照
    val items = mutableListOf("a", "b", "c")
    val items2 = items.toList()
    items.add("d")
    println(items)
    println("--------")
    println(items2)
}