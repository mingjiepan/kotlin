package com.mjie.objects


class Student constructor(val username: String) {
    fun echo() {
        println("username = ${this.username}")
    }
}


class Teacher (private var username: String, private val age: Int, val address: String) {
    fun echo() {
        println("username = ${this.username}, age = $age, address = $address")
    }
}

//在jvm上，如果类的primary构造方法的所有参数都有默认值，那么kotlin编译器就会为这个类生成一个不带参数的构造方法，
//这个不带参数的构造方法会使用这些参数的默认值，这样做的目的在于可以跟spring等框架更好的集成

class Professor  constructor(val username: String = "hello") {
    private var address:String = "world"

    fun echo() {
        println("username = $username")
    }
}

fun main(args: Array<String>) {
    var student = Student("zhangsan")
    student.echo()

    var teacher = Teacher("lisi", 20, "xiamen")
    teacher.echo()

    var professor = Professor()
}