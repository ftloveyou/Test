package demo05

import demo03.Stu

fun main() {
    var stu = Stu(1,"xxx", Dd(1))
    var dd = stu.dd
    stu.dd = Dd(2)
    println(stu.dd)
    println(dd)
}

data class Stu(
    var id: Long? = null,
    var name: String? = null,
    var dd: Dd? = null
)

data class Dd(
    var age: Int? = null
)

