package demo02

fun main() {
    var list = mutableListOf<Person1>()
    for (i in 1..10){
        list.add(Person1(i,"$i"))
    }

    list.add(Person1(1,"1"))
    list.add(Person1(2,"1"))
    list.add(Person1(3,"1"))

    var map = list.groupBy({it.age},{it.name})

    map.forEach { t, u -> println("$t"+"-----"+"$u")}

    println(map[11])


}

data class Person1(
    var age:Int,
    var name:String
)