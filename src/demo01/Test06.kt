package demo01

import java.lang.StringBuilder
import java.text.SimpleDateFormat
import java.util.*

fun main() {
    var begin = System.currentTimeMillis()
    println(begin)
    var date = Date(begin)
    var dateFormate = SimpleDateFormat("yyyy-MM-dd hh:mm:ss")
    println(dateFormate.format(date))
    var end = date.time
    println(end)

    var calendar = Calendar.getInstance()
    calendar.time = date
    println(calendar.time)

    var list = listOf<String>("a","b","c","orgId","phone")
    var str = StringBuilder(list.joinToString("`,`","`","`"))
    println(str)
    println(str.toString().replace("`orgId`","234"))


}