package com.mjie.`object`


open class Fruit {
    open fun name() {
        println("fruit")
    }

    fun source() {
        println("from xiamen")
    }
}

class Apple : Fruit() {

    override fun name() {
        println("apple")
    }
}

open class Orange: Fruit() {
    final override fun name() {
        println("orange")
    }
}

class OrangeChild : Orange() {
    //无法覆盖orange的name方法
    /*override fun name() {
        println("orange child")
    }*/
}


fun main(args: Array<String>) {
    var apple = Apple()
    apple.name()
    apple.source()
}

