package com.mjie.`object`.extension

open class TestParent5

class TestChild5 : TestParent5()

fun TestParent5.echo() {
    println("TestParent5")
}

fun TestChild5.echo() {
    println("TestChild5")
}

/**
扩展函数的解析是静态的
1. 扩展本身并不会真正修改目标类，也就是说它并不会在目标类中插入新的属性或是方法
2. 扩展函数的解析是静态分发的，而不是动态，即不支持多态，调用只取决于对象的声明类型
3. 调用由声明类型决定的，而不是实际类型决定的
 */
class Test5 {
    fun echo(testParent5: TestParent5) {
        testParent5.echo()
    }
}

fun main(args: Array<String>) {
    var testChild5 = TestChild5()

    var test5 = Test5()
    test5.echo(testChild5)
}

