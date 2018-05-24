package com.mjie.controller

fun main(args: Array<String>) {
    method1(2, 3)
}

fun method1(x: Int, y: Int): Unit {
    var max: Int
    var min: Int

    if (x > y) {
        max = x
        min = y
    } else {
        max = y
        min = x
    }

    println("min = $min")
    println("max = $max")
}

fun method2(x: Int, y: Int) {

    var max = if(x > y) x else y
    var min = if(x > y) y else x

    println("max = $max, min = $min")
}

fun method3(x: Int, y: Int) {

    var max = if(x > y) {
        println("x > y")
        x
    } else {
        println("x < y")
        y
    }

    var min = if (x > y) {
        println("x > y")
        y
    } else {
        println("x < y")
        x
    }

    println("min = $min, max = $max")
}
