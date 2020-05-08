package demo02

fun main() {
    var reg = Regex("^([0-9]+)([分]|[天]|[个]|[年])([月]|[钟]?)\$")
    var s =  "100000个月"
    println(s.matches(reg))
    var unitList = listOf<String>("分钟","小时","天","个月","年")
    var unit: String? = null
    unitList.forEach {
       if (s.contains(it)){
           unit = it
       }
   }
    var list = s.split(unit!!)
    println(list[0])


}