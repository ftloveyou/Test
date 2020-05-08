package demo01

import java.text.SimpleDateFormat
import java.util.*

fun main() {
    var date = Date()
    var simpleDateFormat = SimpleDateFormat("yyyy-MM-dd hh:mm:ss")
    var datefor = simpleDateFormat.format(date)
    println(datefor)

    var calendar = Calendar.getInstance()
    println(calendar.get(Calendar.DAY_OF_MONTH))
    calendar.add(Calendar.DAY_OF_MONTH,1)
    println(calendar.get(Calendar.DAY_OF_MONTH))

    var str = null
    println(str?:-1)
}