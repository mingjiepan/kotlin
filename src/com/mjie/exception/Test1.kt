package com.mjie.exception

import java.lang.Integer.parseInt
import java.lang.NumberFormatException

fun main(args: Array<String>) {
    val s = "a"
    val result: Int? = try {
        parseInt(s)
    } catch (ex: NumberFormatException) {
        null
    } finally {
        println("finally invoked")
    }
    println(result)
}