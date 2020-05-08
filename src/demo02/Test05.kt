package demo02

fun main() {
    var str: String = "sdsadsaf\n"+ "dsadasaa\n"+"dsadassa\n"
    var strList = str.split("\n")
    println(strList[0])
    main1()
}

fun main1() {
    var list1 = listOf<Long>(1,2,4)
    var list2 = listOf<Long>(1,2,3)

    var set1 = mutableSetOf<Long>()
    var set2 = mutableSetOf<Long>()

    var com = list1.intersect(list2)
    var w = list1.toMutableSet().removeAll(com)
    set1 = list1.toMutableSet()
    list2.toMutableSet().removeAll(com)
    set2 = list2.toMutableSet()
    println(com)
    println(set1)
    println(set2)


}