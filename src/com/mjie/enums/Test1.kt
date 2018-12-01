package com.mjie.enums

enum class Season {
    SPRING, SUMMER, AUTUMN, WINTER
}

enum class Season2 (val temperature: Int) {
    SPRING(10), AUTUMN(20), SUMMER(30), WINTER(0)
}

enum class Season3 {
    SPRING {
        override fun getSession(): Season3 = SPRING
    },
    SUMMER {
        override fun getSession(): Season3 = SUMMER
    },
    AUTUMN {
        override fun getSession(): Season3 = AUTUMN
    },
    WINTER {
        override fun getSession(): Season3 = WINTER
    }
    ;
    abstract fun getSession(): Season3
}

fun main(args: Array<String>) {
    val values = Season3.values()
    values.forEach { season: Season3 -> println(season) }
    values.forEach { println(it) }

    val valueOf = Season3.valueOf("SPRING")
    println(valueOf)
}