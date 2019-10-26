package com.mjie.lambda
/**
    高阶函数（high-order function）与lambda

    高阶函数：以另一个函数作为参数，或者返回值是函数 称为高阶函数。
    闭包：函数里面声明函数，函数里面返回函数

    lambda表达式格式要求：
    1. 一个lambda表达式总是被一对花括号所包围
    2. 其参数（如果有的话）位于 -> 之前（参数类型可以省略）
    3. 执行体位于 -> 之后

    在kotlin中，如果一个函数的最后一个参数是个函数，那么可以将lambda表达式作为实参传递进去，
    并且可以在调用方法圆括号去使用

    在kotlin中，when表达式、if表达式、lambda表达式都可以作为闭包2
    注：Java不能直接用函数作为参数，只能传递对象的引用，所以在回调函数时，往往传递的是接口的匿名实现。即使是Java8增加了lambda，函数入参也只是接口声明
 */
fun method1(a: Int, b: Int, cal: (Int, Int) -> Int): Int {
   return cal(a, b)
}

fun method2(a: Int, cal: (Int) -> Int): Int {
    return cal(a)
}

fun method3(a: (Int) -> Unit): Unit {
    a(1)
}

fun main() {
    //在定义的左边没有声明lambda的参数类型，在右边需要指明参数的类型
    val addLambda = {a:Int, b:Int -> a + b}

    var result = method1( 1, 2, { a, b -> a + b })
    result = method1(2, 3) {a, b -> a + b}
    println(result)

    println("-------")

    var result2 = method2(1) { a -> a + 1 }
    result2 = method2(1) {it + 2}
    println(result2)

    println("---------")

    //没有入参的lambda
    var noValue = { println("hello world")}
    var noValue2: () -> Unit = { println("hello world")}

    //当入参不使用的时候，用_号代替，注意以下两种的区别
    val action3: (Int, Int) -> Int? = { _, _ -> null }
    //action4可以是一个函数类型，也可以是一个null类型
    val action4: ((Int, Int) -> Int)? = null
}










