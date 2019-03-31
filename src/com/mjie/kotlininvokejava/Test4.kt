package com.mjie.kotlininvokejava

fun main(args: Array<String>) {

    val myVarargs = MyVarargs()

    val strs = arrayOf("hello", "world")

    myVarargs.method(*strs) //spread operator *
}