package com.mjie.`object`

/**
 * 理解field属性
 *
 * var propertyName: Type = initializer
 *      getter().....
 *      setter().....
 *
 * backing field，支撑字段（域）
 * backing property，支撑属性
 */
class FieldTest1 (name: String){
    val age:Int
        get() = 12

    var address:String = "xiamen"
        private set


    var name:String = name
        get() {
            println("getter invoke")
            return field
        }
        set(value) {
            println("setter invoke")
            field = value
        }
}


fun main(args: Array<String>) {
    var fieldTest1 = FieldTest1("zhangsan")
    println(fieldTest1.name)
    println(fieldTest1.address)
    println(fieldTest1.age)
}

