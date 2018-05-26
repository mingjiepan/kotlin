package com.mjie.objects

//一个secondary构造方法必须直接或者间接得调用primary构造方法

class Person constructor(username: String) {

    private var username: String
    private var age: Int
    private var address: String

    init {
        this.username = username
        this.age = 10
        this.address = "xiamen"
    }

    constructor(username: String, age: Int): this(username) {
        println("username = $username, age = $age")
        this.age = age
        this.address = "beijing"
    }

    constructor(username: String, age: Int, address: String):this(username, age) {
        this.address = address
    }

    fun printInfo() {
        println("username:${this.username}, age:${this.age}, address:${this.address}")
    }
}

fun main(args: Array<String>) {
    var person1 = Person("hello")
    person1.printInfo()

    var person2 = Person("world", 20)
    person2.printInfo()

    var person3 = Person("welcome", 30, "hangzhou")
    person3.printInfo()
}