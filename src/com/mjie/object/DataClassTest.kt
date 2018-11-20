package com.mjie.`object`

/**
 * 数据类
 * 数据类需要满足以下要求：
 * 1. primary constructor 至少要有一个参数
 * 2. 所有的primary constructor参数都需要被标记为val或var
 * 3. 数据类不能是抽象的、open的、sealed的记忆inner的
 *
 * 对于数据类，编译器会自动生成如下内容
 * 1. equals和hashcode
 * 2. toString方法，形式为DataClass(name=....,adress=...,age=...)
 * 3. 针对属性的componentN方法，并且是按照属性的声明顺序来生成的
 *
 * 关于数据类成员的继承要点
 * 1. 如果数据类中显示定义了equals、hashcode、toString，或是在数据类的父类中将这些方法声明为了final，
 * 那么这么方法就不会再生成，转而使用现有的。
 * 2. 如果父类有用componentN方法，并且是open的以及返回兼容的类型，那么编译器就会在数据类中生成相应的componentN方法
 * 并且重写父类的这些方法，如果父类中的这些方法由于不兼容的签名或被定义为final，那么编译器就会报错。
 * 3. 在数据类中显式提供componentN方法以及copy方法实现是不允许的。
 *
 * 解构声明
 * 在primary constructor中有多少个方法，就会依次生成对应的component1、component2,.....
 * 这些方法返回的就是对应字段的值，componentN方法是用来实现解构声明的
 */
data class DataClass (val age: Int, var name:String, var address:String)

/**
 * 在jvm平台上，如果生成的类需要拥有无参构造方法，那么就需要为所有属性指定默认值
 * */
data class DataClass2(val age :Int = 10, var name: String = "lisi")

fun main(args: Array<String>) {
    var data1 = DataClass(1, "zhangsan", "xiamen")
    data1.name = "lisi"
    println(data1)

    println("-----------")
    var data2 = data1.copy(address = "beijing")
    println(data2)

    println("-----------")
    var (age, name, address) = data1
    println("$age, $name, $address")
}
