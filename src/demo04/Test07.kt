package demo04

import java.util.*

fun main() {
    var trainList = getTrainList()
    val sc = Scanner(System.`in`)

    while (true){
        println("输入结束标志")
        var flag: Int = sc.nextInt()

        if (flag == 1) break
        println("输入始发站")
        var start: Int =sc.nextInt()
        println("输入到达站")
        var end: Int = sc.nextInt()
        //查询
        var map = queryEmptySeat(trainList, start, end)
        //占座
        trainList = holdSeat(trainList, 0, 2, map.keys.first())
        printTrain(trainList)


    }


}

data class Train(
    var place: String? = null,
    var flag: Int? = null,
    var seatMap: MutableMap<Int,Int>? = null
)

fun getTrainList(): List<Train>{
    val trainList = mutableListOf<Train>()
    for (i in 0..4){
        var t = Train()
        t.place = "北京$i"
        t.flag = i
        var map = mutableMapOf<Int,Int>()
        for (j in 0..9){
            map[j] = 0
        }
        t.seatMap = map

        trainList.add(t)
    }
    return trainList
}

fun queryEmptySeat(trainList: List<Train>, start: Int, end: Int): MutableMap<Int,Int>{
    var map = mutableMapOf<Int,Int>()
    map = trainList.find { it.flag!! == start }?.seatMap!!
    for (t in trainList){
        if (t.flag!! in (start + 1) until end) {
            t.seatMap?.forEach { k,v->
                if (v == 1){
                    map[k] = 1
                }
            }
        }
    }
    return map.entries.filter { it.value == 0 }.sortedBy { it.key }.associateBy({ it.key }, { it.value }).toMutableMap()
}

fun holdSeat(trainList: List<Train>, start: Int, end: Int, seat: Int): List<Train>{
    trainList.forEach {
        if (it.flag in start until end){
            it.seatMap?.set(seat, 1)
        }
    }

    return trainList
}


fun printTrain(trainList: List<Train>){

    for (t in trainList){

        println(t.place)
        t.seatMap?.forEach { k,v->  println("$k---$v")}
        println("---------------------")
    }
}