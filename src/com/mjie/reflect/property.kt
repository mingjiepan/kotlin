package com.mjie.reflect

import kotlin.reflect.KMutableProperty
import kotlin.reflect.full.memberProperties


class MyClass3 constructor(var address: String){
    var name = "zhangsan"
}


fun main() {
    val myClazz = MyClass3::class

    val size = myClazz.memberProperties.size
    println(size)

    val myClass3 = MyClass3("xiamen")

    val find = myClazz.memberProperties.find { it.name == "name" }
    var nameResult = find?.get(myClass3)
    println(nameResult)

    find?.getter?.call(myClass3)

    if (find is  KMutableProperty<*>) {
        find.setter.call(myClass3, "lisi")
    }

    nameResult = find?.getter?.call(myClass3)
    println(nameResult)
}