package com.mjie.kotlininvokejava

fun main(args: Array<String>) {

    val list = ArrayList<String>()

    list.add("hello")
    list.add("world")
    list.add("hello world")

    for (item in list) {
        println(item)
    }

    println("---------")

    for (i in 0 until list.size) {
        println(list[i])
    }

    println("------------")

    val person = Person()
    person.name = "zhangsna"
    person.isMarried = true

    println(person.age)
    println(person.isMarried)

    println("-----------------")


}
