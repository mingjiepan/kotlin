package com.mjie.`object`

/**
 * secondary构造方法必须直接或者间接的调用primary构造方法
 */

class Person constructor(username: String) {

    private var username:String

    private var age: Int

    private var address: String

    init {
        println("username : $username")
        this.username = username
        this.age = 20
        this.address = "beijing"
    }

    constructor(username: String, age: Int) : this (username) {
        println("username=$username, age=$age")
        this.age = age
        this.address  ="shanghai"
    }

    constructor(username: String, age: Int, address:String) : this (username, age) {
        this.address = address
    }

    fun printInfo () {
        println("username : ${this.username}, age: ${this.age}, address: ${this.address}")
    }
}

fun main(args: Array<String>) {
    val person = Person("mjie", 20, "xiamen")
    person.printInfo()
}
