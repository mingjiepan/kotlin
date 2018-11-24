package com.mjie.`object`.generic

class MyGene <out T> (private var t: T) {
    fun get(): T {
        return this.t
    }
    fun set(t: @UnsafeVariance T) {
        this.t = t
    }
}

fun main(args: Array<String>) {
    val myGene1 : MyGene<Int> = MyGene(5)
    val myGene2: MyGene<Any> = myGene1
    val get = myGene2.get()
    println(get)

    println("---------------")
    myGene2.set("hello")
    println(myGene2.get())
}