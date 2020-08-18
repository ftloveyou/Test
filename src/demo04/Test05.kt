package demo04

import java.text.SimpleDateFormat
import java.util.*

fun main() {
    var da = Date(1597128274)
    var dateFormat = SimpleDateFormat("yyyy-MM-dd hh:mm:ss")
    println(dateFormat.format(da))

    var dd = System.currentTimeMillis()
    println(dateFormat.format(dd))
}
