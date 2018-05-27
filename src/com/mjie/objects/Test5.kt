package com.mjie.objects


open class Fruit {
    open fun name() {
        println("fruit")
    }

    fun taste() {
        println("taste fruit")
    }
}


class Apple: Fruit() {
    override fun name() {
        println("apple")
    }
}

open class Orange: Fruit() {
    override fun name() {
        println("orange")
    }
}


fun main(args: Array<String>) {
    var apple = Apple()
    apple.name()
    apple.taste()
}