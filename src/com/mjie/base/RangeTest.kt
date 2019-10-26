package com.mjie.base



fun main(args: Array<String>) {
    //升序步进
    val arr:IntRange = 1..10
    for (i in arr step 2) {
        println(i)
    }

    println("---------")

    //降序步进
    for (i in 10 downTo 2 step 2) {
        println(i)
    }

    println("----------------")

    val a = 10 downTo 1
    for (i in a step 3) {
        println(i)
    }

    println("-------")
    for (i in 1..10 step 3) {
        println(i)
    }
}