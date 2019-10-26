package com.mjie.reflect

import kotlin.reflect.KMutableProperty1
import kotlin.reflect.full.createInstance
import kotlin.reflect.full.declaredMemberProperties


class Property {
    var name: String = "zhangsan"
    val age:Int = 20
}


fun main() {
    val clazz = Property::class
    val properties = clazz.declaredMemberProperties

    var obj = clazz.createInstance()

    properties.forEach {
        when(it.name) {
            "name" -> {
                val kmp = it as KMutableProperty1<Property, Any>
                kmp.set(obj, "lisi")
                println(kmp.get(obj))
            }

            "age" -> {
                println(it.get(obj))
            }
        }
    }
}

