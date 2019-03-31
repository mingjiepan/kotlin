package com.mjie.other

fun List<String>.myFilter(): List<String> {
    return listOf("hello", "world")
}

@JvmName("myFilter2")
fun List<Int>.myFilter(): List<Int> {
    return listOf(1, 2)
}

fun main(args: Array<String>) {
    var str = listOf<String>("hello")
    val myFilter = str.myFilter()
    println(myFilter)
}