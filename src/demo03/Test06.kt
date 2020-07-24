package demo03

import java.util.*

fun main() {
    var time: Long = 1639843200000
    println(Date(time))
    var a: Int? = null
    var b = a?:1
    println(b)

    val list1 = listOf<String>("1","2","3")
    val list2 = listOf<String>("0","2","3")
    println(list1.plus(list2).distinct())
    println(list1)
    println(list2)
}