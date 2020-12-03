package demo05

import com.google.gson.Gson
import demo03.Stu

fun main() {
    var s1 = Stu(1,"是")
    var s2 = Stu(2,"是")
    var  list = listOf(s1, s2)
    var gson = Gson()
    println(gson.toJson(list))
    var pair = Pair(s1,s2)
    var triple = Triple(s1,s2,s1)
    println(pair.first.toString() + pair.second.toString())
    println(triple.first.toString()+ triple.second.toString()+ triple.third.toString())
}