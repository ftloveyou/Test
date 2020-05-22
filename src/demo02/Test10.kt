package demo02

import java.sql.Timestamp
import java.text.SimpleDateFormat
import java.util.*

fun main() {
    var time: Timestamp = Timestamp(1587018492000)
    var dateFormat = SimpleDateFormat("yyyy-MM-dd hh:mm:ss")
    println( dateFormat.format(time))

    var date = Date(1587018492000)
    println(dateFormat.format(date))

    var calendar = Calendar.getInstance()
    println(calendar.get(Calendar.YEAR))
    println(calendar.time)
    println(dateFormat.format(calendar.time))

    var str: String = "2022-12-14 10:10:00"
    var d2 = dateFormat.parse(str)
    var str1 = dateFormat.format(d2)
    println(str1)
    println(d2)


}