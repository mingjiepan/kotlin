package com.mjie.`fun`

fun main(args: Array<String>) {
    var result = sum(1, 2)
    println(result)

    result = substruction(4, 3)
    println(result)

    myprint(1, 2)
}

fun sum(a: Int, b: Int) : Int {
    return a + b
}

fun substruction(a: Int, b: Int) = a +b

fun myprint(a:Int , b:Int) : Unit {
    println(a + b)
}