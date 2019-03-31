package com.mjie.lambda

/*
    高阶函数（high-order function）与lambda
    lambda表达式格式要求：
    1. 一个lambda表达式总是被一对花括号所包围
    2. 其参数（如果有的话）位于 -> 之前（参数类型可以省略）
    3. 执行体位于 -> 之后

    在kotlin中，如果一个函数的最后一个参数是个函数，那么可以将lambda表达式作为实参传递进去，
    并且可以在调用方法圆括号去使用
 */

val multiply: (Int, Int) -> Int = { a, b -> a * b }
val add: (Int, Int) -> Int = { a, b -> a + b }
val subtract = { a: Int, b: Int -> a - b }

val action1: () -> Unit = { println("hello world") }
val action2 = { println("hello world") }

val action3: (Int, Int) -> Int? = { _, _ -> null }
val action4: ((Int, Int) -> Int)? = null





























