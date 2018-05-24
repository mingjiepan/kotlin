package com.mjie.collection

fun main(args: Array<String>) {

    var arr: IntArray  = intArrayOf(1, 2, 3, 4)

    for (item: Int in arr) {
        println(item)
    }

    println("----------------")

    for (i: Int in arr.indices) {
        println("array[$i] = ${arr[i]}")
    }

    println("----------------")

    for ((index, value) in arr.withIndex()) {
        println("$index = $value")
    }
}

