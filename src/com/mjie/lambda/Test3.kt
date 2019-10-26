package com.mjie.lambda

fun String.filter(predicate: (Char) -> Boolean) : String {
    val sb = StringBuilder()

    for (index in 0 until length) {
        val element = get(index)
        if (predicate(element)) {
            sb.append(element)
        }
    }
    return sb.toString()
}

fun main() {
    val str = "hello123world"
    val predicate: (Char) -> Boolean = {
        it.isLetter()
    }

    val filter = str.filter(predicate)
    println(filter)
}
