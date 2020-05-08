package demo02

fun main() {
    var list1 = listOf<String>("2", "1","1","3")
    var list2 = listOf<String>()
    println(list1.containsAll(list2))
    val list3 = list2.distinct()
    println(list3)
}
