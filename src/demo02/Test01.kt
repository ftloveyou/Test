package demo02

fun main() {

    var list1 = listOf<Per>().toMutableList()
    var list2 =listOf<Per>().toMutableList()
    for (i in 0..100){
      var per = Per(i,i,"p$i")
        list1.add(per)

    }
    for (i in 1..99){
        var per = Per(i,i,"p$i")
        list2.add(per)

    }
    println(list1.intersect(list2).toMutableList())//交集
    println(list1.union(list2))//并集
    println(list1.subtract(list2))//差集 在list1不在list2
    println(list1.minus(list2))//补集 一般在父子集关系中 父集包含子集以外的部分










}
data class Per(
    var id: Int,
    var age: Int,
    var name: String
)