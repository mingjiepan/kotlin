package com.mjie.reflect

import kotlin.reflect.full.createInstance
import kotlin.reflect.full.declaredFunctions
import kotlin.reflect.full.functions


class MyFunction1 {
    fun method(message: String) {
        println("message $message")
    }
    fun method(message: String, price: Double) {
        println("message $message + price $price")
    }

    companion object {
        fun method2() {
            println("hello world")
        }
    }
}

fun main() {
    val clazz = MyFunction1::class
    val instance = clazz.createInstance()

    val funs = clazz.functions
    val declareFuns = clazz.declaredFunctions

    funs.forEach { println(it.name) }
    println("---------------------")
    declareFuns.forEach { println(it.name) }
    println("---------------------")

    declareFuns.forEach {

        //这边的参数大小，包含instance
        if (it.parameters.size == 3) {
            it.call(instance, "java", 22.1)
        }
    }
}