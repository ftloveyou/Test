package demo01

data class People(
    var name: String,
    var age: Int
)
fun main() {
    var people1 = People("孙悟空", 100)
    var people2 = People("猪八戒", 40)
    var people3 = People("沙和尚", 30)
    var list = listOf<People>(people1,people2,people3)
    var list1 = list.filter { it.age<50 }
    println(list1)
    var list2 = list.map { it.name }
    println(list2)
    var list3 = listOf<Int>(1,2,3,4)
    var list4 = list3.map { it*2 }
    println(list4)
    println(list3.all { it>0 })
    println(list3.any { it<0 })
    println(list3.count { it>0 })
    println(list3.find { it>0 })
    println(list3.joinToString { it.toString() })
    println(list3.let { it.toString() }.javaClass)




}