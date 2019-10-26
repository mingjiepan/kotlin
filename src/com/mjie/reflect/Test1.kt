package com.mjie.reflect



fun main() {
    val c = String::class
    println(c)

    val c2 = String::class.java
    println(c2)

    val c3 = String::javaClass
    println(c3)
}