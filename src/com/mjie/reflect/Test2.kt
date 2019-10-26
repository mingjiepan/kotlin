package com.mjie.reflect


open class Parent

class Son: Parent()

class Daughter: Parent()



fun main() {
    val son: Parent = Son()
    val daughter: Parent = Daughter()

    println(son::class)
    println(son::class.java)

    println("------")

    println(daughter::class)
    println(daughter::class.java)
}