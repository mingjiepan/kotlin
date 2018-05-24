package com.mjie.collection

fun main(args: Array<String>) {

    val a = 5
    val b = 10

    if(a in 2..b) {
        println("a in the range of 2 and b")
    }

    if (a !in 2..b) {
        println("a not in the range of 2 and b")
    }

    println("--------------")

    for (i in 2..10) {
        println(i)
    }

    println("-----------")

    for(i in 2.rangeTo(10)) {
        println(i)
    }

    println("------------")

    //修改默认的递进值
    for(i in 2..10 step 2) {
        println(i)
    }

    println("---------")

    //步进降序
    for(i in 10 downTo 2 step 3) {
        println(i)
    }
}