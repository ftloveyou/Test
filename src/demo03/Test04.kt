package demo03

fun main() {
    var list1 = mutableListOf<Int>(1,2,3)
    var list2 = mutableListOf<Int>(1,2,4)
    list1.retainAll(list2)
    println(list1)
    list2.removeAll(list1)
    println(list2)
}