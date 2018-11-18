package com.mjie.`object`

/**
 * 属性延迟初始化，在整合spring等框架时，发挥作用
 *
 * kotlin要求非空类型的属性必须要在构造时进行初始化
 * 有时这种要求不太方便，比如，可以通过依赖注入或是单元测试情况下进行属性的赋值
 * 通过lateinit关键字标识属性为延迟初始化，需要满足如下3个条件
 * 1. lateinit 只能用在类体重声明的var属性上，不能用在primary constructor声明的属性上
 * 2. 属性不能拥有自定义的setter与getter
 * 3. 属性类型需要为非空，且不能是原生数据类型
 */
class LateinitTest1 {
    lateinit var name:String

    fun init(name:String) {
        this.name = name
    }
}


fun main(args: Array<String>) {
    var lateinitTest1 = LateinitTest1()
    lateinitTest1.init("zhangsan")
    println(lateinitTest1.name)
}
