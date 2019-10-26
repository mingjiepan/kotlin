package com.mjie.reflect

import kotlin.reflect.full.createInstance


class MyConstructor (var name: String) {

    var price = 0.0

    constructor(): this("未知商品") {
        this.price = 0.0
    }

    constructor(name: String, price: Double): this(name) {
        this.price = price
    }
}


fun main() {
    val clazz = MyConstructor::class
    val obj = clazz.createInstance()

    println("name = ${obj.name} + ${obj.name}")

    val cons = clazz.constructors

    cons.forEach {
        val size = it.parameters.size
        if (size == 2) {
            val instance2 = it.call("java", 22.3)
            println(instance2.name)
            println(instance2.price)
        }
    }
}