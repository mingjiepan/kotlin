package com.mjie.lambda

/**
 * 匿名函数与lambda
 *
 * 匿名函数格式：
 * fun(参数列表):返回类型 {
 *      函数体
 * }
 */
fun cal(a: Int, b: Int, cal : (Int, Int) -> Int): Int {
    return cal(a, b)
}

fun main() {
    var addMethod = fun(a: Int,b: Int) : Int {
        return a + b
    }

    var multiplyMethod = fun (a: Int, b: Int) : Int? = a * b

    var result = addMethod(1, 2)
    println(result)

    var result2 = multiplyMethod(2, 3)
    println(result2)

    //对比以下三项，可以发现lambda表达式其实就是匿名函数
    var addLambda1: (Int, Int) -> Int = addMethod
    val addLambda2: (Int, Int) -> Int = {a, b -> a + b}
    val addLambda3: (Int, Int) -> Int = (fun(a: Int, b: Int) : Int = a * b)

    println("---------")

    //可以将匿名函数传给lambda
    var result3 = cal(4, 5, addMethod)
    result3 = cal(4, 5) {a, b -> a + b}
    println(result3)
}