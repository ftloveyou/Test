package demo03

fun main() {
    var s1 = Stu(1,"1")
    var s2 = Stu(2,"2")
    var s3 = Stu(3,"3")
    var s4 = Stu(4,"5")
    var s5 = Stu(5,"1")
    var s6 = Stu(6,"2")
    var list = listOf<Stu>(s1,s2,s3,s4,s5,s6)
    var list1 = listOf<String>("1","2")
    var list3 = list.filterNot { list1.contains(it.name) }
    println(list3)
}
