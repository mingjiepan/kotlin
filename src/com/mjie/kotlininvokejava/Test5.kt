package com.mjie.kotlininvokejava


fun main(args: Array<String>) {
    val myException = MyException()
//    myException.method()
    println("-----------")

    val clazz = MyException()::class.java
    println(clazz)
    println("--------")
    println(MyException().javaClass)
}