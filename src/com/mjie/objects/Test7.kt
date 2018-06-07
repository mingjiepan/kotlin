package com.mjie.objects

interface A {

    fun method() {
        println("A method")
    }
}

open class B {
    open fun method() {
        println("B method")
    }
}

class C: A, B() {
    override fun method() {
        super<A>.method()
        super<B>.method()
        println("C override A method")
    }
}

fun main(args: Array<String>) {
    var c = C()
    c.method()
}