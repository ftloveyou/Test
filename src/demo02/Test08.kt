package demo02

fun main() {
    var p1 = Person(1,1,"1")
    var p2 = Person(2,2,"3")
    var list1 = listOf<Person>()
    var list2 = listOf<Person>(p1,p2)
    println(list1 == list2)
    println(list1)
    println(list2)

}