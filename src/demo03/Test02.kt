package demo03

fun main() {
    var s1 = Stu("11","11")
    var s2 = Stu("11",null)
    var list = mutableListOf<Stu>(s1,s2)
    var map = list.groupBy { it.name }
    var list1 = map["11"]
    if(list1!!.map { it.age }.distinct().size > 1) print(true) else print(false)
}

data class Stu(
    var name:String? = null,
    var age: String? = null
)
