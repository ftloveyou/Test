package demo05

fun main() {
    var m1 = Material(1,1,"1")
    var m2 = Material(2,2, "1,2")
    var m3 = Material(3,2, "")
    var list = listOf<Material>(m1,m2,m3)
    var list1 = list.filter { it.type == 1 }.map { it.value?.toLong() } +
            list.filter { it.type == 2 }.mapNotNull { it.value?.split(",") }.flatten().map { it.toLong() }
}

data class Material(
    var id: Long? = null,
    var type: Int? = null,
    var value: String? = null
)