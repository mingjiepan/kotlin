package com.mjie.base



fun main(args: Array<String>) {
    //升序步进
    val arr:IntRange = 1..10
    for (i in arr step 2) {
        println(i)
    }

    //降序步进
    for (i in 10 downTo 2 step 2) {
        println(i)
    }
}