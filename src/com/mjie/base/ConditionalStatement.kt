package com.mjie.base

/**
 * 条件语句
 */
fun main(args: Array<String>) {

    var maxNumber = 1

    val x = 10
    val y = 8
    if (x > y)
        maxNumber = x
     else
        maxNumber = y

    println("--------------------")

    var minNumber = if (x > y) y else x
    println("minNumber=$minNumber")

    println("-----------------------")

    var result = if (x > y) {
        println("x > y")
        x
    } else {
        println("x < y")
        y
    }
    println("resul=$result")
    println("--------------------------")
}