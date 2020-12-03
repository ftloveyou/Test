package demo05

import com.google.gson.JsonObject
import jdk.nashorn.internal.parser.JSONParser
import java.sql.Timestamp
fun main() {
    var t1 = Test02(1,"sss",Timestamp(1000000000))
    var t2 = Test02(2,"sss",Timestamp(2000000000))
    var t3 = Test02(3,"xxx",Timestamp(1000000000))
    var t4 = Test02(4,"xxx",Timestamp(2000000000))
    var t5 = Test02(5,"sss",Timestamp(3000000000))
    var t6 = Test02(6,"aaa",Timestamp(1000000000))
    var list = listOf<Test02>(t1,t2,t3,t4,t5,t6)
    val map = list.sortedByDescending { it.time }.groupBy { it.name }
    for (map1 in map){
        println(map1.value.get(0))
    }

    var ss = "99.999999"
    println(ss.toBigDecimal())
}

data class Test02(
    var id: Long,
    var name: String,
    var time: Timestamp
)