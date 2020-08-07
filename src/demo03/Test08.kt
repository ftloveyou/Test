package demo03

fun main() {

    var s1 = Stu(null,"1")
    var s2 = Stu(null,"2")

    var list = listOf<Stu>(s1,s2)
    var ids = mutableListOf<Long>()
    list.forEach {
        it.id?.let { id -> ids.add(id) }
    }

    println(ids)

    if (ids?.any { it > 0 }){
        println("xxxxx")
    }
}

data class Stu(
    var id: Long? = null,
    var name: String? = null
)