package demo02

fun main() {
    var p1 = Person(1,12,"11")
    var p2 = Person(2,13,"22")
    var p3 = Person(3,12,"33")
    var p4 = Person(4,12,"44")
    var p5 = Person(5,12,"55")
    var list1 = listOf<Person>(p1,p2,p3,p4,p5)
    var list2 = list1.sortedByDescending { it.id }
    var list =list2.distinctBy { it.age }
    println(list)

}

data class Person(
    var id: Int,
    var age: Int,
    var name: String
)