package com.mjie.base

/**
 * kotlin基本数据类型 Byte、Int、Short、Long、Double、Char、Boolean
 * 每个基本数据类型都有对应的数组类型ByteArray、IntArray、ShortArray、LongArray、DoubleArray、CharArray、BooleanArray
 * 注意：字符串String不是基本数据类型，因此没有对应的StringArray，用Array<String>表示
 */

fun main(args: Array<String>) {

    val a:Byte  = 1
    val b:Short = 2
    val c:Int = 3
    val d:Long = 4L
    val e:Double = 1.1
    val f:Char = 'a'
    val g:String = "hello"
    val h:Boolean = true

    var iArr = intArrayOf(1, 2, 3, 4, 5)
    var sArr:ShortArray = shortArrayOf(1, 3, 4, 5)
    var dArr:DoubleArray = doubleArrayOf(1.1, 1.2, 1.3)
    var lArr:LongArray = longArrayOf(1,2 ,3 , 4)
    var bArr:ByteArray = byteArrayOf(1,2, 43, 4)
    var cArr:CharArray = charArrayOf('a', 'c')
    var booleanArr:BooleanArray = booleanArrayOf(true, false)
    var strArr:Array<String> = arrayOf("hello", "world")
}