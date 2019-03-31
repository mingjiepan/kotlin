package com.mjie.kotlininvokejava
/*
使用@JvmField注解对Kotlin中的属性进行标注时，表示它是一个实例字段（instance field），kotlin编译器在处理的时候，将不会给这个字段
生成getter/setter
 */
class Person2 {
    var name: String = "lisi"

    @JvmField
    var age: Int = 10
}
