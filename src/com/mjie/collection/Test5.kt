package com.mjie.collection

fun main(args: Array<String>) {
    val i = 4

    //左闭右闭
    if (i in 1..5) {
        println("i = $i")
    }

    println("-- ---------")

    for (a in 1..4) {
        println(a)
    }

    println("------------")

    for (a in 4 downTo 1) {
        println(a)
    }

    println("------------")

    for (a in 10 downTo 2 step 2) {
        println(a)
    }

    println("------------")

    //左闭右开
    for (a in 1 until 10 step 3) {
        println(a)
    }
}