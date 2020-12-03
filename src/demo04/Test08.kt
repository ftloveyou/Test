package demo04


fun main() {
    var list = listOf<Long>(1,2)
    val list1 = list.toMutableList()
    list1.add(3)
    list1.forEach{
        println(it)
    }

}

object Student{
    const val a = 111

}

class Test08 {
    companion object {
        const val ss = 1111
        const val ee = 22222;
    }
}
