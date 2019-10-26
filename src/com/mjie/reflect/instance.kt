package com.mjie.reflect

import kotlin.reflect.KFunction
import kotlin.reflect.full.createInstance
import kotlin.reflect.full.functions


class MyInstance{

    fun printSomething() {
        println("something")
    }

    fun printNothing() {
        println("nothing")
    }
}

fun main() {

    var myInstanceClass = MyInstance::class
    var myObj = myInstanceClass.createInstance()


    val kFunction:KFunction<*>? = myInstanceClass.functions.find { it.name == "printSomething" }
    kFunction?.call(myObj)

}

