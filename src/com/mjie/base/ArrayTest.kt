package com.mjie.base

/**
 * 获取数组元素的几种方式
 */
fun main(args: Array<String>) {

    var arr:IntArray = intArrayOf(2, 4, 6, 8, 10)

    arr.forEach { println(it)}

    println("-------------------------")

    for (a:Int in arr) {
        println(a)
    }

    println("-------------------------")

    for (i in arr.indices) {
        println("arr[$i] = ${arr[i]}")
    }

    println("------------------------")

    for ((key, value) in arr.withIndex()) {
        println("key: $key, value: $value")
    }

    println("----------测试数组包含某个元素--------------------")

    val indexOf = arr.indexOf(8)
    println("index of : $indexOf")
}