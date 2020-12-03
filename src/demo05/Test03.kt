package demo05

fun main() {
    var m1 = MBom(1,1)
    var m2 = MBom(2,2)
    var m3 = MBom(3,3)
    var mBomList = listOf(m1,m2,m3)

    var p1 = ProcessRoute(1,4)
    var p2 = ProcessRoute(2,5)
    var p3 = ProcessRoute(4,4)
    var pList = listOf(p1,p2,p3)
    var pMap = pList.associateBy { it.id }
    mBomList.forEach {
        it.seq = pMap[it.id]?.seq ?: it.seq
    }

    mBomList.forEach {
        println(it.seq)
    }

}

data class MBom(
    var seq: Int? = null,
    var id: Long? = null
)

data class ProcessRoute(
    var id: Long? = null,
    var seq: Int? = null
)