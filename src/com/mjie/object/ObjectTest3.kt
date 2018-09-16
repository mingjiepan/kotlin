package com.mjie.`object`

class Student (private val username:String, private val age: Int, private val address:String) {
    fun printInfo () {
        println("username : $username, age: $age, address:$address")
    }
}

//如果构造方法拥有注解或者可见性修饰符，那么constructor关键字不能省略
class Student2 private constructor() {

}

/*在jvm上，如果primary所有参数都拥有默认值，那么kotlin编译器还会生成一个不带参数的构造方法
这个不带参数的构造方法会使用这些参数的默认值，这样做的目的在于可以跟spring等框架更好的集成。
*/
class Student3 constructor(private val username: String = "zhangsan") {

    fun printInfo() {
        println("username : $username")
    }
}

fun main(args: Array<String>) {
    val student = Student("zhangsan", 20, "xiamen")
    student.printInfo()


    val student3 = Student3()
    student3.printInfo()
}