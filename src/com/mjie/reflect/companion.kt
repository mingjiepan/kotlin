package com.mjie.reflect

import kotlin.reflect.full.companionObject
import kotlin.reflect.full.companionObjectInstance
import kotlin.reflect.full.functions


class MyCompanion {
    companion object {
        fun method() {
            println("hello world")
        }
    }
}

fun main() {

    var myCompanion = MyCompanion::class
    var companion = myCompanion.companionObject

    println(companion)

    val kFunction = companion?.functions?.find { it.name == "method" }
    kFunction?.call(myCompanion.companionObjectInstance)
}
